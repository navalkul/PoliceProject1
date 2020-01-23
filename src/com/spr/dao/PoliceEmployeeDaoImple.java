package com.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spr.dto.PoliceEmployee;

@Repository
public class PoliceEmployeeDaoImple implements PoliceEmployeeDao {
	
	@Autowired
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	/*
	  @ResponseBody static public String getParamId(@RequestParam String ps_id) {
	  return ps_id; }
	 */
	
	@Override	
	//public List<PoliceEmployee> policeList(@ RequestParam (name = "ps_id") String pid) {
	
	public List<PoliceEmployee> policeList(int ps_id) {
		
		String sql = "select*from employee where ps_id = ?"; 
		
		List<PoliceEmployee> poEmpList = 
				jt.query(sql, new Object[]{ps_id}, new RowMapper<PoliceEmployee>() 
				{

					@Override
					public PoliceEmployee mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						PoliceEmployee poEmp= new PoliceEmployee();
						
						 poEmp.setEmp_id(rs.getInt("emp_id"));
				            poEmp.setEmp_name(rs.getString("emp_name"));
				            poEmp.setEmp_mob(rs.getLong("emp_mob"));
				            poEmp.setEmp_desig(rs.getString("emp_desig"));
				            poEmp.setEmp_dob(rs.getDate("emp_dob"));
				            poEmp.setEmp_email(rs.getString("emp_email"));
				            poEmp.setPs_id(rs.getInt("ps_id"));
						
				           System.out.println(poEmp);
						return poEmp;
					}
					
				});
				
		
	
		return poEmpList;
	}

}
