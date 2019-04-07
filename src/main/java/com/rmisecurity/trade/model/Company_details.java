package com.rmisecurity.trade.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_details")
public class Company_details {
	
	
	@Id
	@GeneratedValue
	private Long company_id;
	private String symbol;
	
	private float open;
	private float high;
	private float low;
	private float price;
	private int volume;
	private String latest_trading_day;
	private float previous_close;
	@Column(name="chang")
	private  float change;
	private float change_percent;
	public Long getId() {
		return company_id;
	}
	public void setId(Long company_id) {
		this.company_id = company_id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public float getOpen() {
		return open;
	}
	public void setOpen(float open) {
		this.open = open;
	}
	public float getHigh() {
		return high;
	}
	public void setHigh(float high) {
		this.high = high;
	}
	public float getLow() {
		return low;
	}
	public void setLow(float low) {
		this.low = low;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getLatest_trading_day() {
		return latest_trading_day;
	}
	public void setLatest_trading_day(String latest_trading_day) {
		this.latest_trading_day = latest_trading_day;
	}
	public float getPrevious_close() {
		return previous_close;
	}
	public void setPrevious_close(float previous_close) {
		this.previous_close = previous_close;
	}
	public float getChange() {
		return change;
	}
	public void setChange(float change) {
		this.change = change;
	}
	public float getChange_percent() {
		return change_percent;
	}
	public void setChange_percent(float change_percent) {
		this.change_percent = change_percent;
	}
	public Company_details(Long company_id) {
		super();
		this.company_id = company_id;
	}
	public Company_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
