package com.spr.dto;

import java.util.Date;

public class PoliceEmployee {

	private int emp_id;
	private String emp_name;
	private Long emp_mob;
	private String emp_desig;
	private String emp_email;
	private Date emp_dob;
	private int ps_id;
	

	public PoliceEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PoliceEmployee(int ps_id) {
		super();
		this.ps_id = ps_id;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Long getEmp_mob() {
		return emp_mob;
	}
	public void setEmp_mob(Long emp_mob) {
		this.emp_mob = emp_mob;
	}
	public String getEmp_desig() {
		return emp_desig;
	}
	public void setEmp_desig(String emp_desig) {
		this.emp_desig = emp_desig;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public Date getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}
	public int getPs_id() {
		return ps_id;
	}
	public void setPs_id(int ps_id) {
		this.ps_id = ps_id;
	}
	@Override
	public String toString() {
		return "PoliceEmployee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_mob=" + emp_mob + ", emp_desig="
				+ emp_desig + ", emp_email=" + emp_email + ", emp_dob=" + emp_dob + ", ps_id=" + ps_id + "]";
	}
	
	
}
