package com.callcenter.service.impl;

import java.util.Map;

import com.callcenter.controller.ICallcenter;
import com.callcenter.model.Employee;
import com.callcenter.model.JuniorExecutive;
import com.callcenter.model.Manager;
import com.callcenter.model.SeniorExecutive;
import com.callcenter.service.CallHandelerFactory;
import com.callcenter.util.CallCenterUtil;


public class SeCallHandlerImpl implements ICallcenter {

	/*public Employee[] calR(String[] rp, String type) {
		// TODO Auto-generated method stub
		Employee[] empAr = new Employee[rp.length];
		
		for (int i = 0; i < rp.length; i++) {
			Employee emp = CallCenterUtil.doCalculaion(rp[i], 7);
			emp.setId(type + (i + 1));
			empAr[i] = emp;
		}
		return empAr;
	}*/

	@Override
	public Employee[] getCallResp(String[] rp) {
		// TODO Auto-generated method stub
		Employee[] empAr = new Employee[rp.length];
		System.out.println("Implementer Array len"+rp.length);
	
		for (int i = 0; i < rp.length; i++) {
			Map<String,Integer> emp = CallCenterUtil.doCalculaion(rp[i], "se");
			SeniorExecutive seniorEx=new SeniorExecutive();
			seniorEx.setId("se" + (i + 1));
			seniorEx.setCallsAttended(emp.get("callAttended"));
			seniorEx.setEscalated(emp.get("unResolved"));
			seniorEx.setResolved(emp.get("resolved"));
			seniorEx.setTimeTaken(emp.get("tiemTaken"));
			
			empAr[i] = seniorEx;
		}
		return empAr;
	}

	}
