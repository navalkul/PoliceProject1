package com.spr.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

//PoliceStationList
//----------------------------------------------------------------------------------------
	@RequestMapping(value = "/poList",method = RequestMethod.POST)
	public ModelAndView listOfPoliceEmp(@RequestParam String id) {

		int id1=Integer.parseInt(id);

		ModelAndView model=new ModelAndView();

		List<PoliceEmployee> poEmpList = policeEmpServ.policeList(id1);

		model.addObject("poEmpList", poEmpList);
		model.setViewName("home");
		return model ;
	}

//PoliceEmployeeList
//---------------------------------------------------------------------------------------------------------------

	@RequestMapping(value = "assignAdmin", method = RequestMethod.POST)
	public ModelAndView assignSubAdmin(@RequestParam String id,@RequestParam String roleId,HttpSession session)
	{
		int id1 = Integer.parseInt(id);
		int roleId1 = Integer.parseInt(roleId);
		String nk = "nk";
		ModelAndView model = new ModelAndView();

		if(roleId1 == 0 && session.getAttribute("userName").equals(nk))
		{
			roleId1 = 22;
			policeEmpServ.setPsAdmin(id1, roleId1);
		}

		else if(roleId1 == 22  && session.getAttribute("userName").equals(nk))
		{	
			String roleId2 = null;
			policeEmpServ.removePsAdmin(id1,roleId2);
		}
		model.setViewName("home");
		return model;

	}

//Police SubAdmin Role Assignment
//---------------------------------------------------------------------------------------------------------------

		@RequestMapping(value = "deleteAdmin", method = RequestMethod.POST)
		public ModelAndView removeSubAdmin(@RequestParam String id,@RequestParam String roleId,HttpSession session)
		{
			int id1 = Integer.parseInt(id);
			int roleId1 = Integer.parseInt(roleId);
			String nk = "nk";
			ModelAndView model = new ModelAndView();

			if(roleId1 == 0 && session.getAttribute("userName").equals(nk))
			{
				roleId1 = 22;
				policeEmpServ.setPsAdmin(id1, roleId1);
			}

			else if(roleId1 == 22  && session.getAttribute("userName").equals(nk))
			{	
				String roleId2 = null;
				policeEmpServ.removePsAdmin(id1,roleId2);
			}
			model.setViewName("home");
			return model;

		}	


//Employee's for Police SubAdmin
//---------------------------------------------------------------------------------------------------------------

		@RequestMapping(value = "psEmpListForSubAdmin",method = RequestMethod.POST)
		public ModelAndView displayListToSubAdmin(ModelAndView model,@RequestParam String userName) {
			
			int gotId = policeEmpServ.getSubAdminPsId(userName);
			System.out.println("GOT ID IS -> "+gotId+"GOT UserName IS ->"+userName);
			
			List<PoliceEmployee> policeList = policeEmpServ.policeEmpList(gotId);
		
			model.addObject("policeList", policeList);
			model.setViewName("S_AdminHome");
		
			return model;
		}
		
		
		
}

