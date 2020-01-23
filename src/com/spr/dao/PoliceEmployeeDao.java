package com.spr.dao;

import java.util.List;


import com.spr.dto.PoliceEmployee;

public interface PoliceEmployeeDao {
	
	//List<PoliceEmployee> policeList(@ RequestParam (name = "ps_id") String pid);
	
	List<PoliceEmployee> policeList(int ps_id);
}
