package com.KrushiSevaCenter.dao;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.KrushiSevaCenter.entity.DairyBank;

public interface BankDao extends CrudRepository<DairyBank, BigInteger>{
 
}
