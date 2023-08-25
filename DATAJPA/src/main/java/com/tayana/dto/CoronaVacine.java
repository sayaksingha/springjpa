package com.tayana.dto;

import jakarta.persistence.Entity;

@Entity
public class CoronaVacine {
	private String name;
	private Integer price;
	private String company;
	private String origin;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Integer getNo_of_dose() {
		return no_of_dose;
	}
	
	public void setNo_of_dose(Integer no_of_dose) {
		this.no_of_dose = no_of_dose;
	}
	private Integer no_of_dose;
	@Override
	public String toString() {
		return "CoronaVacine [name=" + name + ", price=" + price + ", company=" + company + ", origin=" + origin
				+ ", no_of_dose=" + no_of_dose + "]";
	}
	
	
	

}
