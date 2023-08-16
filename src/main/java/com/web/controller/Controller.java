package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.Model.EmployeeLogin;
import com.web.service.EmployeeService;

@RestController
public class Controller {

	@Autowired
	public EmployeeService service;
	

	@PostMapping("/save")
	public String saveEmployee(@RequestBody EmployeeLogin employee)
	{
		EmployeeLogin e = service.saveEmployee(employee);
		String msg = null;
		if(e!=null) {
			msg = " Data Successfully Insersted";
		}else{
			msg="error";	
		}
		return msg;
		
	}
}
