package com.rmisecurity.trade.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rmisecurity.trade.model.TradeOneModel;
import com.rmisecurity.trade.service.TradeOneService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@CrossOrigin
@RestController
public class TradingOneController {

	
	@Autowired
	private TradeOneService tradeOneService;

	
	@PostMapping("/rmisecurity/tradestock")
	public void saveStock(@Valid @RequestBody TradeOneModel stock) {
		tradeOneService.saveTradeStock(stock);
		System.out.println("saved");
	}
	
	@GetMapping("/rmisecurity/stmt/{userId}/stockname")
	public List<TradeOneModel> getStockDetailsForUser(@PathVariable("userId") String userId ) {
	 return tradeOneService.getTradeDetails(userId);
	 
	}
}


