package com.callcenter.util;

import java.util.HashMap;
import java.util.Map;

import com.callcenter.model.Employee;
import com.callcenter.model.JuniorExecutive;
import com.callcenter.model.Manager;
import com.callcenter.model.SeniorExecutive;

public class CallCenterUtil {

	public static Map<String,Integer> doCalculaion(String strIp, String type) {
		int totalMin = 0;
		int totalResolve = 0;
		int totalExs = 0;
		int thrshold = 0;
		Employee emp = null;
		Map<String,Integer> map=new HashMap<String,Integer>();
		switch (type) {
		case "je":
			thrshold = 7;
			emp = new JuniorExecutive();
			break;
		case "se":
			thrshold = 10;
			emp = new SeniorExecutive();
			break;
		case "mgr":
			thrshold = 15;
			emp = new Manager();
			break;
		default:

		}

		String[] arr = strIp.split(",");
		for (int i = 0; i < arr.length; i++) {
			int temp = Integer.parseInt(arr[i]);
			totalMin += temp;
			if (temp > thrshold) {
				totalExs++;
			} else {
				totalResolve++;
			}
		}
		
		emp.setTimeTaken(totalMin);
		emp.setCallsAttended(arr.length);
		emp.setResolved(totalResolve);
		map.put("callAttended", arr.length);
		map.put("tiemTaken", totalMin);
		map.put("resolved", totalResolve);
		map.put("unResolved", totalExs);
		return map;
	}


}
