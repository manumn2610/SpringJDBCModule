package com.example.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository(value="EmployeeDao")
public class GetEmployeeDetailsDaoImpl implements GetEmployeeDetailsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	

	@Override
	public String getEmpDetails() {
		
		String query= "select * from  Employees";
		
		jdbcTemplate.execute(query);
		
		return "success";
	}
	
	public int employeeCount()
	{
		
		final String sql="select count(*) from employees";
		
		return 1;
	}
	
	
	public String createEmployeeDetails()
	{
		final String sql = "insert into employees(employee_id,"
				+ "first_name, "
				+ "last_name,"
				+ " email,"
				+ "hire_date,"
				+ "job_id) "
				+ "values(?,?,?,?,sysdate,?)";
		//KeyHolder keyholder=new GeneratedKeyHolder();
		
	//jdbcTemplate.update(sql, args, argTypes)
		
		jdbcTemplate.update((new PreparedStatementCreator()  {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				
				PreparedStatement pst=con.prepareStatement(sql);																																																																																																																																																																																																																																																																																	
				pst.setInt(1, 347);
				pst.setString(2, "paddy1");
				pst.setString(3, "a");
				pst.setString(4,"paddy12.a@gmail.com");
			//	pst.setDate(5, new java.sql.Date(26/5/2018));
				pst.setString(5, "SA_REP");
				
				// TODO Auto-generated method stub
				return pst;
			}
		}));
		return "Success";
	}


}
