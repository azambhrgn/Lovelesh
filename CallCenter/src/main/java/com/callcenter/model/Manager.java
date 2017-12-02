package com.callcenter.model;

public class Manager extends Employee {
	private int unresolved;

	public int getUnresolved() {
		return unresolved;
	}

	public void setUnresolved(int unresolved) {
		this.unresolved = unresolved;
	}

	public Manager(int unresolved) {
		super();
		this.unresolved = unresolved;
	}
	
	public Manager() {
		
	}
	
	@Override
	public String toString() {
		return super.toString() + "Manager [unresolved=" + unresolved + "]";
	} 
}
