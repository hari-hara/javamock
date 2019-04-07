package com.rmisecurity.trade.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmisecurity.trade.model.TradeOneModel;



@Repository
public interface TradeOneRepositary extends JpaRepository<TradeOneModel, Integer> {

}
