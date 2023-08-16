package com.web.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeLogin {
@Id
private int eid;
private String name;
private String email;
private String password;
private String cpassword;
public EmployeeLogin() {
	super();
}
public EmployeeLogin(int eid, String name, String email, String password, String cpassword) {
	super();
	this.eid = eid;
	this.name = name;
	this.email = email;
	this.password = password;
	this.cpassword = cpassword;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCpassword() {
	return cpassword;
}
public void setCpassword(String cpassword) {
	this.cpassword = cpassword;
}
@Override
public String toString() {
	return "EmployeeLogin [eid=" + eid + ", name=" + name + ", email=" + email + ", password=" + password
			+ ", cpassword=" + cpassword + "]";
}


}
