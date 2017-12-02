package com.callcenter.model;

import java.util.ArrayList;
import java.util.List;

public class Response {

	private int numberOfCalls;
	private int totalResolved;
	private int totalUnresolved;
	private int totalTimeTaken;
	private List<Employee> performance = new ArrayList<>();
	
	public Response() {}
	
	public Response(int numberOfCalls, int totalResolved, int totalUnresolved, int totalTimeTaken,
			List<Employee> performance) {
		super();
		this.numberOfCalls = numberOfCalls;
		this.totalResolved = totalResolved;
		this.totalUnresolved = totalUnresolved;
		this.totalTimeTaken = totalTimeTaken;
		this.performance = performance;
	}

	public int getNumberOfCalls() {
		return numberOfCalls;
	}

	public void setNumberOfCalls(int numberOfCalls) {
		this.numberOfCalls = numberOfCalls;
	}

	public int getTotalResolved() {
		return totalResolved;
	}

	public void setTotalResolved(int totalResolved) {
		this.totalResolved = totalResolved;
	}

	public int getTotalUnresolved() {
		return totalUnresolved;
	}

	public void setTotalUnresolved(int totalUnresolved) {
		this.totalUnresolved = totalUnresolved;
	}

	public int getTotalTimeTaken() {
		return totalTimeTaken;
	}

	public void setTotalTimeTaken(int totalTimeTaken) {
		this.totalTimeTaken = totalTimeTaken;
	}

	public List<Employee> getPerformance() {
		return performance;
	}

	public void setPerformance(List<Employee> performance) {
		this.performance = performance;
	}
	
}
