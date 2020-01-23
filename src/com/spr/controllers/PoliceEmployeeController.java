package com.spr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spr.dto.PoliceEmployee;
import com.spr.service.PoliceEmployeeService;

@Controller
public class PoliceEmployeeController {

	@Autowired
	public PoliceEmployeeService policeEmpServ;

	public void setPoliceEmpServ(PoliceEmployeeService policeEmpServ) {
		this.policeEmpServ = policeEmpServ;
	}

@RequestMapping(value = "/poList",method = RequestMethod.POST)
public ModelAndView listOfPoliceEmp(@RequestParam String id) {

	int id1=Integer.parseInt(id);
	ModelAndView model=new ModelAndView();
	
	List<PoliceEmployee> poEmpList = policeEmpServ.policeList(id1);
	
	model.addObject("poEmpList", poEmpList);
	model.setViewName("home");
	return model ;
 }

}