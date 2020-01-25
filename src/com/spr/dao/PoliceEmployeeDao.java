package com.spr.dao;

import java.util.List;


import com.spr.dto.PoliceEmployee;

public interface PoliceEmployeeDao {
	
	List<PoliceEmployee> policeList(int ps_id);
	
	void setPsAdmin(int emp_id,int role_id);
	
	void removePsAdmin(int emp_id,String role_id);
	
	List<PoliceEmployee> policeEmpList(int ps_id);
	
	int getSubAdminPsId(String userName);
}
