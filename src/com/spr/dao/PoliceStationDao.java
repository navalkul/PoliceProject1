package com.spr.dao;

import java.util.List;

import com.spr.dto.Fir;
import com.spr.dto.PoliceStation;

public interface PoliceStationDao {

	List<PoliceStation> pList();
	
	List<Fir>fList(Fir fir);
}
