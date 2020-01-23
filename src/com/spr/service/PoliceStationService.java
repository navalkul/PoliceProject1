package com.spr.service;

import java.util.List;

import com.spr.dto.Fir;
import com.spr.dto.PoliceStation;

public interface PoliceStationService {

	public List<PoliceStation> pList();
	
	public List<Fir>fList(Fir fir);
}
