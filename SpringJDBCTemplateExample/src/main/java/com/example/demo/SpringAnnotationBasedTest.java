package com.example.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.Dao.GetEmployeeDetailsDaoImpl;
import com.example.jdbc.AppConfig;


public class SpringAnnotationBasedTest {
	
	public static void main(String args[])
	{
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		System.out.println("Contect DataSource>>>>>>>>>>"+context.getBean("jdbcTemplate"));
		GetEmployeeDetailsDaoImpl Dao=(GetEmployeeDetailsDaoImpl)context.getBean("EmployeeDao");
		System.out.println("Contect DataSource>>>>>>>>>>"+Dao.createEmployeeDetails());
		
		
	/*	try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:paddy","HR","HR");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from employees");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+" - "+rs.getString(2)+" - "+rs.getString(3));  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}*/  

		
	}

}
