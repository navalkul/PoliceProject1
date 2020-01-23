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
	
	
	/*
	 * @Override public List<PoliceEmployee> policeList(String pid) {
	 * 
	 * return policeEmpDao.policeList(pid); }
	 */

}
