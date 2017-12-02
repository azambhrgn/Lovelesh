package com.callcenter.model;

public class SeniorExecutive extends Employee{

private int escalated;
	
	public SeniorExecutive() {}

	public SeniorExecutive(int escalated) {
		super();
		this.escalated = escalated;
	}

	public int getEscalated() {
		return escalated;
	}

	public void setEscalated(int escalated) {
		this.escalated = escalated;
	} 
	@Override
	public String toString() {
		return super.toString() + "SeniorExecutive [escalated=" + escalated + "]";
	} 
	
}
