package com.rmisecurity.trade.service;

import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public interface TradeTwoService {

	public Map<String, Integer> getTradeStock(String userName);
	
	public Map<String,Long> getAllStock();
	
	
}
