package com.example.demodata;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Person {
	
	private Integer pid;
	private String pname;
	private Integer page;
	
	
	private Passport pt;
	
	
	
	private List<Mobiles> m;
	private Map<Courses,String> c;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Passport getPt() {
		return pt;
	}
	public void setPt(Passport pt) {
		this.pt = pt;
	}
	public List<Mobiles> getM() {
		return m;
	}
	public void setM(List<Mobiles> m) {
		this.m = m;
	}
	public Map<Courses,String> getC() {
		return c;
	}
	public void setC(Map<Courses,String> c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", page=" + page + ", pt=" + pt + ", m=" + m + ", c=" + c;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer pid, String pname, Integer page, Passport pt, List<Mobiles> m, Map<Courses,String> c) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.page = page;
		this.pt = pt;
		this.m = m;
		this.c = c;
		
	}
	
	
	

}
