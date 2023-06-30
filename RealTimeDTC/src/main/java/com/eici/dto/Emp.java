package com.eici.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;  

@Entity  

@Table  

public class Emp {

	@Id  
	@Column  
	private int empid = 123;  
	@Column  
	private String empname = "rrk";  
	@Column  
	private String location = "BOM";  
	@Column  
	private int salary = 1000;
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}  
	
}
