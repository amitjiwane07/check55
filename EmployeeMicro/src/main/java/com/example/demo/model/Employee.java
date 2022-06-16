package com.example.demo.model;


import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	Long eId;
	String name;
	String department;
	List<Laptop> laptop;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long eId, String name, String department, List<Laptop> laptop) {
		super();
		this.eId = eId;
		this.name = name;
		this.department = department;
		this.laptop = laptop;
	}
	public Employee(Long eId, String name, String department) {
		super();
		this.eId = eId;
		this.name = name;
		this.department = department;
	}
	public Long geteId() {
		return eId;
	}
	public void seteId(Long eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", department=" + department + ", laptop=" + laptop + "]";
	}
	
	
	

}
