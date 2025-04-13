package com.KrushiSevaCenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.KrushiSevaCenter.dao.BankDao;
import com.KrushiSevaCenter.dao.FarmerDao;
import com.KrushiSevaCenter.entity.DairyBank;
import com.KrushiSevaCenter.entity.Farmer;
import com.nt.entity.Employee;

@Component
public class FarmerService {
 
	@Autowired
	private FarmerDao dao;
	@Autowired
	private BankDao dao1;
	
	public Farmer add(Farmer f) {
		Farmer  m =dao.save(f);
		return m;
	}

	public int updateFarmerName(Integer id, String name) {
      return dao.updateFarmerNameById(id, name);
      
    }

	public List<Farmer> findAll() {
     List<Farmer> list = dao.findAll();
		return list;
	}

	public void deleteById(int id) {
		dao.deleteById(id);		
	}

	public int updateFarmerAddress(Integer id, String address) {
	      return dao.updateFarmerAddressById(id, address);
		
	}
	
	public List<Farmer> getFarmerByName(String name) {
		return dao.findByNameContainingIgnoreCase(name);
		
	}

	public DairyBank add(DairyBank bnk) {
		DairyBank d = dao1.save(bnk);
		return d;
	}

	
	

	
	
}
