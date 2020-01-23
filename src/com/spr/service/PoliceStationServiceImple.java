package com.spr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spr.dao.PoliceStationDao;
import com.spr.dto.Fir;
import com.spr.dto.PoliceStation;

@Service
public class PoliceStationServiceImple implements PoliceStationService {

	@Autowired
	private PoliceStationDao policeStationDao;
	
	public void setpoliceStationDao(PoliceStationDao policeStationDao)
	{
		this.policeStationDao=policeStationDao;
	}
	
	@Override
	public List<PoliceStation> pList() {
		
		return policeStationDao.pList();
	}

	@Override
	public List<Fir> fList(Fir fir) {
		// TODO Auto-generated method stub
		return null;
	}

}
