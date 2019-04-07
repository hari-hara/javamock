package com.rmisecurity.trade.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmisecurity.trade.model.Company;
import com.rmisecurity.trade.repositary.CompanyRepository;



@Service
public class CompanyServiceImpl implements CompanyService{
	
	
	@Autowired
	private CompanyRepository company_repo;
	
	public List<Company> getCompanyList(){
		List<Company> company_list=new ArrayList<>();
		company_repo.findAll().forEach((e)->company_list.add(e));
		return company_list;
	}	


}
