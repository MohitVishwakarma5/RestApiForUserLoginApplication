package com.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Model.EmployeeLogin;

public interface Repo extends JpaRepository<EmployeeLogin, Integer> {
	EmployeeLogin findByPassword(String password);
//	EmployeeLogin findByEmail(String email);

}
