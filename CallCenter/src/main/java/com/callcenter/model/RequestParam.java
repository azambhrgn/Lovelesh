package com.callcenter.model;

import java.util.Arrays;

public class RequestParam {

	private String number_of_calls;
	
	public String getNumber_of_calls() {
		return number_of_calls;
	}
	public void setNumber_of_calls(String number_of_calls) {
		this.number_of_calls = number_of_calls;
	}
	private String [] je;
	private String [] se;
	private String mgr;
	
	public String[] getJe() {
		return je;
	}
	public void setJe(String[] je) {
		this.je = je;
	}
	public String[] getSe() {
		return se;
	}
	public void setSe(String[] se) {
		this.se = se;
	}
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	@Override
	public String toString() {
		return "RequestParam [number_of_calls=" + number_of_calls + ", je=" + Arrays.toString(je) + ", se="
				+ Arrays.toString(se) + ", mgr=" + mgr + "]";
	}
	
}
