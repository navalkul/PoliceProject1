package com.spr.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spr.dto.PoliceStation;
import com.spr.service.PoliceStationService;

@Controller
public class PoliceStationController {

	@Autowired
	private PoliceStationService psService;
	
	public void setpsService(PoliceStationService psService)
	{
		this.psService=psService;
	}
	
	@RequestMapping(value="/pslist",method=RequestMethod.POST)
	public ModelAndView policeStList(ModelAndView model)throws IOException
	{
		List<PoliceStation>psList=psService.pList();
		model.addObject("psList",psList);
		model.setViewName("home");
		
		return model;
	}
}
