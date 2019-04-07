package com.rmisecurity.trade.repositary;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rmisecurity.trade.model.Company;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long>{

}
