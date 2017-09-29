package com.ust.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class ContractEmployee extends Employee {
	
	double ratePerMonth;
	
	public ContractEmployee(){
		
	}
	
	public ContractEmployee(String name, double ratePerMonth) {
		super(name);
		this.ratePerMonth = ratePerMonth;
	}

	public ContractEmployee(double ratePerMonth) {
		super();
		this.ratePerMonth = ratePerMonth;
	}

	public double getRatePerMonth() {
		return ratePerMonth;
	}

	public void setRatePerMonth(double ratePerMonth) {
		this.ratePerMonth = ratePerMonth;
	}

	@Override
	public String toString() {
		return "ContractEmployee [ratePerMonth=" + ratePerMonth + ", id=" + id + ", name=" + name + "]";
	}
	
	

}
