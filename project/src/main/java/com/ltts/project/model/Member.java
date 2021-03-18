package com.ltts.project.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String empName;
	private String design;
	private String department;
	private String Immediatesupervisor;
	private String mobile;
	private String email;
	
	
	
	@Id
	private String empid;
	
	
	
	
	
	public Member() {
		super();
	}





	public Member(String empName, String design, String department, String immediatesupervisor, String mobile,
			String email, String empid) {
		super();
		this.empName = empName;
		this.design = design;
		this.department = department;
		Immediatesupervisor = immediatesupervisor;
		this.mobile = mobile;
		this.email = email;
		this.empid = empid;
	}





	public String getEmpName() {
		return empName;
	}





	public void setEmpName(String empName) {
		this.empName = empName;
	}





	public String getDesign() {
		return design;
	}





	public void setDesign(String design) {
		this.design = design;
	}





	public String getDepartment() {
		return department;
	}





	public void setDepartment(String department) {
		this.department = department;
	}





	public String getImmediatesupervisor() {
		return Immediatesupervisor;
	}





	public void setImmediatesupervisor(String immediatesupervisor) {
		Immediatesupervisor = immediatesupervisor;
	}





	public String getMobile() {
		return mobile;
	}





	public void setMobile(String mobile) {
		this.mobile = mobile;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public String getEmpid() {
		return empid;
	}





	public void setEmpid(String empid) {
		this.empid = empid;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}





	@Override
	public String toString() {
		return "Member [empName=" + empName + ", design=" + design + ", department=" + department
				+ ", Immediatesupervisor=" + Immediatesupervisor + ", mobile=" + mobile + ", email=" + email
				+ ", empid=" + empid + "]";
	}


}