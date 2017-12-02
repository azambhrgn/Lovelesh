package com.callcenter.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.callcenter.model.Employee;
import com.callcenter.model.JuniorExecutive;
import com.callcenter.model.RequestParam;
import com.callcenter.model.SeniorExecutive;
import com.callcenter.service.CallHandelerFactory;
import com.callcenter.service.impl.JeCallHandlerImpl;

@RestController
public class DemoController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/callcenter")
	public List<Employee> processInformation(@RequestBody RequestParam reqParam) {
		//System.out.println(reqParam.toString());
		ICallcenter jeImpl =  CallHandelerFactory.callAttended("je");
		Employee[] resp = jeImpl.getCallResp(reqParam.getJe());
		
		ICallcenter seImpl =  CallHandelerFactory.callAttended("se");
		Employee[] seResp = seImpl.getCallResp(reqParam.getSe());
		
		String[] str = new String[1];
		str[0] = reqParam.getMgr();
		ICallcenter mgrImpl =  CallHandelerFactory.callAttended("mgr");
		Employee[] mgrResp = mgrImpl.getCallResp(str);
		
		/*Employee[] jeop = impl.callAttended(reqParam.getJe(),"je");
		System.out.println(jeop[0].toString()); 
		Employee[] seop = impl.callAttended(reqParam.getSe(),"se");
		System.out.println(seop[0].toString());
		String[] str = new String[1];
		str[0] = reqParam.getMgr();
		Employee[] mngr = impl.callAttended(str, "mngr");*/
		System.out.println(Arrays.toString(resp));
		System.out.println(Arrays.toString(seResp));
		System.out.println(mgrResp[0].toString());
		List<Employee> empList = new ArrayList<>();
		for(Employee e: resp) {
			empList.add(e);
		}
		for(Employee e: seResp) {
			empList.add(e);
		}
		empList.add(mgrResp[0]);
		return empList;
	}
}

