package com.callcenter.model;

public class JuniorExecutive extends Employee {
	private int escalated;
	
	public JuniorExecutive() {}

	public JuniorExecutive(int escalated) {
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
		return super.toString() + "JuniorExecutive [escalated=" + escalated + "]";
	} 
	
}
