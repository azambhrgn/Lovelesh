package com.callcenter.service;

import com.callcenter.controller.ICallcenter;
import com.callcenter.model.Employee;
import com.callcenter.model.JuniorExecutive;
import com.callcenter.service.impl.JeCallHandlerImpl;
import com.callcenter.service.impl.MgrCallHandlerImpl;
import com.callcenter.service.impl.SeCallHandlerImpl;

public abstract class CallHandelerFactory {

	public static ICallcenter callAttended(String type) {
		
		if("je".equals(type)) {
			return new JeCallHandlerImpl();
		}
		else if("se".equals(type)) {
			return new SeCallHandlerImpl();
		}
		else if("mgr".equals(type)) {
			return new MgrCallHandlerImpl();
		}
		else		
		return null;
	}
}
