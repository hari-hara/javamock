package com.rmisecurity.trade.model;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="company")
public class Company{
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@OneToMany(fetch=FetchType.EAGER)
	@JoinColumn(name="company_id")
	private List<Company_details> company_details;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Company(Long id) {
		super();
		this.id = id;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Company_details> getCompany_details() {
		return company_details;
	}
	public void setCompany_details(List<Company_details> company_details) {
		this.company_details = company_details;
	}
	

}
