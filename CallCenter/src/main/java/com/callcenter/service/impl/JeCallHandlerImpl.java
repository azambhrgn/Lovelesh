package com.callcenter.service.impl;

import java.util.Map;

import com.callcenter.controller.ICallcenter;
import com.callcenter.model.Employee;
import com.callcenter.model.JuniorExecutive;
import com.callcenter.model.Manager;
import com.callcenter.model.SeniorExecutive;
import com.callcenter.service.CallHandelerFactory;
import com.callcenter.util.CallCenterUtil;


public class JeCallHandlerImpl implements ICallcenter {

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
			Map<String,Integer> emp = CallCenterUtil.doCalculaion(rp[i], "je");
			JuniorExecutive jEx=new JuniorExecutive();
			jEx.setId("je" + (i + 1));
			jEx.setCallsAttended(emp.get("callAttended"));
			jEx.setEscalated(emp.get("unResolved"));
			jEx.setResolved(emp.get("resolved"));
			jEx.setTimeTaken(emp.get("tiemTaken"));
			
			empAr[i] = jEx;
		}
		return empAr;
	}

	}
