package com.rmisecurity.trade.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rmisecurity.trade.model.Company;
import com.rmisecurity.trade.service.CompanyService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@CrossOrigin
@RestController
@EnableSwagger2
@RequestMapping("rmisecurity")
public class StocksController {


	@Autowired
	private CompanyService company_service;

	@GetMapping("/getDetails")
	public ResponseEntity<List<Company>> getStocs(){
		
		return ResponseEntity.ok().body(company_service.getCompanyList());
	}

}
