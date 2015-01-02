/**
 * 
 */
package com.netsol.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * @author Harmeet Singh(Taara)
 *
 */
@Configuration
@PropertySource(value={"classpath:properties/db.properties"})
public class DatabaseConfiguration {

	@Autowired
	private Environment environment;
	
	@Bean
	public DataSource dataSource(){
		try{
			ComboPooledDataSource dataSource = new ComboPooledDataSource();
			dataSource.setJdbcUrl(environment.getProperty("db.url"));
			dataSource.setDriverClass(environment.getProperty("db.driver.class"));
			dataSource.setUser(environment.getProperty("db.username"));
			dataSource.setPassword(environment.getProperty("db.password"));
			dataSource.setIdleConnectionTestPeriod(60);
			dataSource.setMaxPoolSize(100);
			dataSource.setMaxStatements(50);
			dataSource.setMinPoolSize(10);
			return dataSource; 
		}catch(Exception ex){
			throw new RuntimeException(ex);
		}
	}
}
