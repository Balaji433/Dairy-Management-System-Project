package com.KrushiSevaCenter.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "farmers")
public class Farmer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date_of_registration")
	private Date date_of_registration;
	
	@Column(name = "contact")
	private String contact;
	
	@Column(name = "route")
	private String route;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "branch")
	private String branch;
	
	@Column(name = "remark")
	private String remark;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dairy_bank_id", referencedColumnName = "iddairy_bank")
    private DairyBank dairyBank;
	
	public Farmer(int id, String name, Date date_of_registration, String contact, String route, String address,
			String status, String branch, String remark,  DairyBank dairyBank) {
		super();
		this.id = id;
		this.name = name;
		this.date_of_registration = date_of_registration;
		this.contact = contact;
		this.route = route;
		this.address = address;
		this.status = status;
		this.branch = branch;
		this.remark = remark;
        this.dairyBank = dairyBank;

	}
	
	public Farmer() {
		 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_of_registration() {
		return date_of_registration;
	}

	public void setDate_of_registration(Date date_of_registration) {
		this.date_of_registration = date_of_registration;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public DairyBank getDairyBank() {
		return dairyBank;
	}

	public void setDairyBank(DairyBank dairyBank) {
		this.dairyBank = dairyBank;
	}	
	
	

}
   


