package com.spr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.dao.PoliceEmployeeDao;
import com.spr.dto.PoliceEmployee;

@Service
public class PoliceEmployeeServiceImple implements PoliceEmployeeService {

	@Autowired
	PoliceEmployeeDao policeEmpDao; 
	public void setPoliceEmpDao(PoliceEmployeeDao policeEmpDao) {
		this.policeEmpDao = policeEmpDao;
	}

	@Override
	public List<PoliceEmployee> policeList(int ps_id) {
		
		return policeEmpDao.policeList(ps_id);
	}

	@Override
	public void setPsAdmin(int emp_id, int role_id) {
		
		policeEmpDao.setPsAdmin(emp_id, role_id);
	}

	@Override
	public void removePsAdmin(int emp_id,String role_id) {
		
		System.out.println("INside service class");
		//policeEmpDao.removePsAdmin(emp_id,role_id);
		policeEmpDao.removePsAdmin(emp_id,role_id);
		
		
		
	}
	
	
}
