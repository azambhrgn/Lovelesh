package com.callcenter.model;

public class Employee {

	private String id;
	private int timeTaken;
	private int callsAttended;
	private int resolved;
	
	public Employee() {
		
	}
	
	
	public Employee(String id, int timeTaken, int callsAttended, int resolved) {
		super();
		this.id = id;
		this.timeTaken = timeTaken;
		this.callsAttended = callsAttended;
		this.resolved = resolved;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getTimeTaken() {
		return timeTaken;
	}
	public void setTimeTaken(int timeTaken) {
		this.timeTaken = timeTaken;
	}
	public int getCallsAttended() {
		return callsAttended;
	}
	public void setCallsAttended(int callsAttended) {
		this.callsAttended = callsAttended;
	}
	public int getResolved() {
		return resolved;
	}
	public void setResolved(int resolved) {
		this.resolved = resolved;
	}
	


	@Override
	public String toString() {
		return "Employee [id=" + id + ", timeTaken=" + timeTaken + ", callsAttended=" + callsAttended + ", resolved="
				+ resolved +  "]";
	}
	
}
