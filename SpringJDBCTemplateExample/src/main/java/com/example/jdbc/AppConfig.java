package com.example.jdbc;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.example")
@PropertySource("classpath:application.properties")
public class AppConfig {
	
	
	@Autowired
	Environment env;
	
	/*spring.datasource.url=jdbc:oracle:thin:@localhost:1521/paddy
			spring.datasource.username=HR
			spring.datasource.data-password=HR
			spring.datasource.driver-class-name=oracle.jdbc.OracleDriver*/
			
	private final String URL="spring.datasource.url";
	private final String USERNAME="spring.datasource.username";
	private final String PWD = "spring.datasource.data-password";
	private final String DRIVERCLASS="spring.datasource.driver-class-name";
	
	@Bean(name="dataSource")
	public DataSource dataSource()
	{
		DriverManagerDataSource driverManagerDataSource =new DriverManagerDataSource();
		
		driverManagerDataSource.setUrl(env.getProperty(URL));
		driverManagerDataSource.setUsername(env.getProperty(USERNAME));
		driverManagerDataSource.setPassword(env.getProperty(PWD));
		driverManagerDataSource.setDriverClassName(env.getProperty(DRIVERCLASS));
		
		
		return driverManagerDataSource;
		
	}
	
	@Bean(name="jdbcTemplate")
	public JdbcTemplate jdbcTemplate()
	{
		
		JdbcTemplate jdbc=new JdbcTemplate(dataSource());
		return jdbc;
	}
	
	

}
