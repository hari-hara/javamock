package com.rmisecurity.trade.service;


import java.util.List;

import com.rmisecurity.trade.model.TradeOneModel;



public interface TradeOneService {

		
	public void saveTradeStock(TradeOneModel e);
	
	public List<TradeOneModel> getTradeDetails(String userId);
	
	
	
}
