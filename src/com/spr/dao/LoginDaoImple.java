package com.spr.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spr.dto.User;

@Repository
public class LoginDaoImple implements LoginDao {

	@Autowired
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	
	@Override
	public User Login(User user) {
		// TODO Auto-generated method stub
		
		String sql="select * from userLogin where username=? and password=?";
		
		User user1=jt.queryForObject(sql,new Object[]{user.getUserName(),user.getPassword()},new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				User user2=new User();
				
				
				user2.setUserName(rs.getString(1));
				user2.setPassword(rs.getString(2));
				user2.setRole_id(rs.getInt(3));
				System.out.println(user2.getUserName());
				return user2;
				
			}}
				
			);
		
		
		if(user1==null)
		{
				return user1;
		}
		
		
		return user1;
	}

}
