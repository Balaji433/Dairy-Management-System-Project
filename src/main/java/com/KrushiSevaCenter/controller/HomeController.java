package com.KrushiSevaCenter.controller;


import java.util.List;

import org.hibernate.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.KrushiSevaCenter.dao.BankDao;
import com.KrushiSevaCenter.dao.FarmerDao;
import com.KrushiSevaCenter.entity.DairyBank;
import com.KrushiSevaCenter.entity.Farmer;
import com.KrushiSevaCenter.service.FarmerService;
import com.nt.entity.Employee;


@Controller
public class HomeController {

	@Autowired
	private FarmerDao dao;
	
	@Autowired
	private BankDao dao1;
	
	@Autowired
	private FarmerService farmservice;
	
	@GetMapping( "/" )
	public String loginPage() {
		return "login/login";
	}
	
	@GetMapping( "/home" )
	public String dashboard() {
		return "index";
	}


	@GetMapping( "/addFarmerForm" )
	public String addFarmerForm() {
		
		return "addFarmer";
	}
	
	@GetMapping( "/AddBankDetails" )
	public String AddBankDetails() {
		
		return "AddBankDetails";
	}
	
	@GetMapping( "/product" )
	public String product() {
		return "product";
	}
	
	@PostMapping("/add")
	public String addRecord(@ModelAttribute Farmer f) {
       Farmer far = farmservice.add(f);
		return "home";
	}
	
	@PostMapping("/addbank")
	public String addBank(@ModelAttribute DairyBank bnk) {
		DairyBank d = farmservice.add(bnk);
		return "home";
	}
	
	@GetMapping( "/UpdateName" )
	public String UpdateNameForm() {
		return "UpdateName";
	}
	 @PostMapping("/update")
	    public String updateNameById(@RequestParam Integer id, @RequestParam String name) {
	        farmservice.updateFarmerName(id, name);
	        return "UpdateSuccess";
	    }
	 @GetMapping( "/UpdateAddress" )
		public String UpdateAddressForm() {
			return "UpdateAddress";
	 }
	 
	 @PostMapping("/updateadd")
	    public String updateFarmerAddressById(@RequestParam Integer id, @RequestParam String address) {
	        farmservice.updateFarmerAddress(id, address);
	        return "UpdateSuccess";
	    }
	 

	 @GetMapping( "/NameFarmerList" )
		public String NameList() {
			return "name";
	 }
	//1-take a form with 1 input & 1 sumbit button
	 //create a contorller method which will read the name and get or fetch then list of form by name
	 //show the list on jsp
	 //primiry key and foreign key- one to one relation
	 
	    @GetMapping("/search")
		public String searchFarmers(@RequestParam("name") String name, Model model) {
			List<Farmer> farmers = farmservice.getFarmerByName(name);
			model.addAttribute("farmlist1",farmers);
			return "NameList";
		}

	@GetMapping("/FarmerAll")
	public String allRecords(Model model) {
		List<Farmer> farmers = farmservice.findAll();
		model.addAttribute("farmlist",farmers);
		return "FarmerAll";
	}
	
	@GetMapping( "/DeleteFarmerForm" )
	public String DeleteFarmerForm() {
		return "delete";
	}
	
	@GetMapping("/delete")
	public String deleteRecord(@RequestParam int id) {
		farmservice.deleteById(id);
		return "DeleteSuccess";
	}
	
	//read farmer data using postmapping

}