package com.rmisecurity.trade.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmisecurity.trade.model.StockTransaction;
import com.rmisecurity.trade.service.TradeTwoService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin
@RestController
@RequestMapping("/rmisecurity") 
public class TradeController {
	
	
	@Autowired
	private TradeTwoService tradeTwoService;

	@GetMapping("/version")
	public String version() {
		return "10.10.10:10";
	}

	
	/*@GetMapping("/{stockName}")
	public List<StockTransaction> getStockByName(@PathVariable("stockName") String stockName) { 
		
		
		List<StockTransaction> listOfStock = new ArrayList<>(); 
		StockTransaction stock = null;
		Map<String, Integer> tradeStock =  tradeTwoService.getTradeStock(stockName);
		 for (Map.Entry<String,Integer> entry : tradeStock.entrySet()) {
			 stock = new StockTransaction();
			 stock.setStockName(entry.getKey());
			 stock.setQuantity(entry.getValue().toString());
			 listOfStock.add(stock);
		 }

		return listOfStock;
	}*/
	
	@GetMapping("/tradeAnalytics") 
	public List<StockTransaction> getAllStock() { 
		
		List<StockTransaction> listOfStock = new ArrayList<>(); 
		StockTransaction stockTransaction = null;
		int i = 1;
		Map<String, Long> tradeStock =  tradeTwoService.getAllStock();
		 for (Map.Entry<String,Long> entry : tradeStock.entrySet()) {
			 stockTransaction = new StockTransaction();
			 stockTransaction.setId(i++);
			 stockTransaction.setStockName(entry.getKey());
			 stockTransaction.setStockTransation(entry.getValue()+"");
			 listOfStock.add(stockTransaction);
		 }
		return listOfStock;
	}
}
