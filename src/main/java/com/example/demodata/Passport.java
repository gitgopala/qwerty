package com.example.demodata;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Passport {

	private Integer ppid;
	private String pnumber;
	private String plocation;
	private String pexp;
	public Integer getPpid() {
		return ppid;
	}
	public void setPpid(Integer ppid) {
		this.ppid = ppid;
	}
	public String getPnumber() {
		return pnumber;
	}
	public void setPnumber(String pnumber) {
		this.pnumber = pnumber;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public String getPexp() {
		return pexp;
	}
	public void setPexp(String pexp) {
		this.pexp = pexp;
	}
	@Override
	public String toString() {
		return "ppid=" + ppid + ", pnumber=" + pnumber + ", plocation=" + plocation + ", pexp=" + pexp;
	}
	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passport(Integer ppid, String pnumber, String plocation, String pexp) {
		super();
		this.ppid = ppid;
		this.pnumber = pnumber;
		this.plocation = plocation;
		this.pexp = pexp;
	}
	
	
}
