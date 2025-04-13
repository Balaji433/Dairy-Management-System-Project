package com.KrushiSevaCenter.entity;


import java.math.BigInteger;
import java.security.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "dairy_bank")
public class DairyBank {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "iddairy_bank")
	private int iddairy_bank;
	
	@Column(name = "bank_name")
	private String bank_name;
	
	@Column(name = "IFSC_code")
	private String IFSC_code;
	
	@Column(name = "branch_name")
	private String branch_name;
	
	@Column(name = "account_number")
	private String account_number;
	
	@Column (name = "UPI_id")
	private String UPI_id;
	
	@OneToOne(mappedBy = "dairyBank")
    private Farmer farmer;

	public DairyBank(int iddairy_bank, String bank_name, String IFSC_code, String branch_name, String account_number,
			String UPI_id) {
		super();
		this.iddairy_bank = iddairy_bank;
		this.bank_name = bank_name;
		this.IFSC_code = IFSC_code;
		this.branch_name = branch_name;
		this.account_number = account_number;
		this.UPI_id = UPI_id;
	}
	
	public DairyBank() {
		 
	}

	public int getIddairy_bank() {
		return iddairy_bank;
	}

	public void setIddairy_bank(int iddairy_bank) {
		this.iddairy_bank = iddairy_bank;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getIFSC_code() {
		return IFSC_code;
	}

	public void setIFSC_code(String IFSC_code) {
		this.IFSC_code = IFSC_code;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getUPI_id() {
		return UPI_id;
	}

	public void setUPI_id(String UPI_id) {
		this.UPI_id = UPI_id;
	}
}
