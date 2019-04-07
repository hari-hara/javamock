package com.rmisecurity.trade.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "stockName", "quantity" })
public class Stock { 

	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonProperty("stockName")
	private String stockName;
	
	@JsonProperty("quantity")
	private String quantity;

	@JsonProperty("stockName")
	public String getStockName() {
		return stockName;
	}

	@JsonProperty("stockName")
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@JsonProperty("quantity")
	public String getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
