package com.example.demodata;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mobiles {

	private Integer mid;
	private String sim;
	private Long mnumber;
	
	
	
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getSim() {
		return sim;
	}
	public void setSim(String sim) {
		this.sim = sim;
	}
	public Long getMnumber() {
		return mnumber;
	}
	public void setMnumber(Long mnumber) {
		this.mnumber = mnumber;
	}
	@Override
	public String toString() {
		return "mid=" + mid + ", sim=" + sim + ", mnumber=" + mnumber;
	}
	public Mobiles(Integer mid, String sim, Long mnumber) {
		super();
		this.mid = mid;
		this.sim = sim;
		this.mnumber = mnumber;
	}
	public Mobiles() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
