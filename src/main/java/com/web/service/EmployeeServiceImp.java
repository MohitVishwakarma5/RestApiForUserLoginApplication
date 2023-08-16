package com.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Model.EmployeeLogin;
import com.web.repo.Repo;

@Service
public class EmployeeServiceImp implements EmployeeService{

	@Autowired
	public Repo r;

	@Override
	public EmployeeLogin saveEmployee(EmployeeLogin employee) {
		
		EmployeeLogin findPassword = r.findByPassword(employee.getPassword());
		EmployeeLogin findCpassword = r.findByPassword(employee.getCpassword());
		
		
		if(findPassword!=null && findCpassword!=null) throw new RuntimeException ("Password already exist");
		
		
		String psw = employee.getPassword();
		String cpsw = employee.getCpassword();
		if(psw.equals(cpsw)) {
			return r.save(employee);
		}else{
			return null;
	}	
		
	}

}

