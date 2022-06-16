package com.example.demo.model;

public class Laptop {
	Long lid;
	String model;
	Long eid;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(Long lid, String model, Long eid) {
		super();
		this.lid = lid;
		this.model = model;
		this.eid = eid;
	}
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", model=" + model + ", eid=" + eid + "]";
	}

	
}
