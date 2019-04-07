package com.rmisecurity.trade.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmisecurity.trade.model.TradeOneModel;
import com.rmisecurity.trade.repositary.TradeOneRepositary;


@Service
public class TradeOneServiceImp implements TradeOneService {

	@Autowired
	private TradeOneRepositary tradeRepo;
	
	@Override
	public void saveTradeStock(TradeOneModel m) {
		
		tradeRepo.save(m);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TradeOneModel> getTradeDetails(String userId) {
	 // TODO Auto-generated method stub
	  List <TradeOneModel> list = tradeRepo.findAll();
	  List <TradeOneModel> listOfStocks = new ArrayList();
	  for(int i = 0; i<list.size(); i++) {
	   if(list.get(i).getUserName().equalsIgnoreCase(userId)) {
	    listOfStocks.add(list.get(i));
	   }
	  }
	  return listOfStocks;
	}

}
