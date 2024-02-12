package com.example.demodata;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Courses {

	private Integer cid;
	private String cname;
	private Double cfee;
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getCfee() {
		return cfee;
	}
	public void setCfee(Double cfee) {
		this.cfee = cfee;
	}
	@Override
	public String toString() {
		return "cid=" + cid + ", cname=" + cname + ", cfee=" + cfee;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(Integer cid, String cname, Double cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cfee = cfee;
	}
	
	
}
