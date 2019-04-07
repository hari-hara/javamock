package com.rmisecurity.trade.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockTransaction {

	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockTransation() {
		return StockTransation;
	}

	public void setStockTransation(String stockTransation) {
		StockTransation = stockTransation;
	}

	private String stockName;
	
	private String StockTransation;

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	
}
