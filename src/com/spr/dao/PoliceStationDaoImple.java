package com.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spr.dto.Fir;
import com.spr.dto.PoliceStation;

@Repository
public class PoliceStationDaoImple implements PoliceStationDao {
	
	@Autowired
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}

	@Override
	public List<PoliceStation> pList() {
		// TODO Auto-generated method stub
		
		String sql="select * from policestation";
		
		List<PoliceStation> poList=jt.query(sql, new RowMapper<PoliceStation>() {
			
			
			 @Override
		        public PoliceStation mapRow(ResultSet rs, int rowNum) throws SQLException {
		            PoliceStation ps = new PoliceStation();
		 
		            ps.setPs_Id(rs.getInt("ps_id"));
		            ps.setPs_Name(rs.getString("ps_name"));
		            ps.setPs_Address(rs.getString("ps_add"));
		          
		 
		            return  ps;
		        }
		 
		}
				
				
				);
		System.out.println(poList.toString());
		return poList;
	}

		

	@Override
	public List<Fir> fList(Fir fir) {
		// TODO Auto-generated method stub
		return null;
	}

}
