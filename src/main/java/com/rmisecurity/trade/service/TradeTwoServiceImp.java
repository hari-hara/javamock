package com.rmisecurity.trade.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmisecurity.trade.model.Stock;
import com.rmisecurity.trade.model.TradeOneModel;
import com.rmisecurity.trade.repositary.TradeOneRepositary;

@Service
public class TradeTwoServiceImp implements TradeTwoService {

	@Autowired
	private TradeOneRepositary tradeRepo;

	@Override
	public Map<String, Long> getAllStock() {

		List<TradeOneModel> listTradeOneModel = tradeRepo.findAll();
		List<String> listOfStock = new ArrayList<>();
		for (TradeOneModel tradeOneModel : listTradeOneModel) {
			listOfStock.add(tradeOneModel.getStockName());
		}
		
		Map<String, Long> frequencyMap =
				listOfStock.stream().collect(Collectors.groupingBy(Function.identity(), 
														Collectors.counting()));
		return frequencyMap;
	}

	@Override
	public Map<String, Integer> getTradeStock(String userName) {

		List<TradeOneModel> listTradeOneModel = tradeRepo.findAll();
		List<Stock> listOfStock = new ArrayList<>();
		Stock st = null;
		for (TradeOneModel tradeOneModel : listTradeOneModel) {
			st = new Stock();
			st.setUserName(tradeOneModel.getUserName());
			st.setStockName(tradeOneModel.getStockName());
			st.setQuantity(tradeOneModel.getQty() + "");
			listOfStock.add(st);
		}
		Map<String, Integer> map = new HashMap<>();
		for (Stock stock : listOfStock) {
			if (map.containsKey(stock.getStockName())) {
				map.put(stock.getStockName(), map.get(stock.getStockName()) + Integer.parseInt(stock.getQuantity()));
			} else {
				map.put(stock.getStockName(), Integer.parseInt(stock.getQuantity()));
			}
		}
		return map;
	}
}
