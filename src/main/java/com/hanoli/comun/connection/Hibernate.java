package com.hanoli.comun.connection;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.hanoli.comun.exception.ConnectionException;

public class Hibernate {
	
	private Properties properties;
	
	public Hibernate(Properties properties)throws ConnectionException {
		try {
			this.properties = properties;	
		} catch (Exception e) {
			throw new ConnectionException(e);
		}
		
	}


	public LocalSessionFactoryBean getLocalSessionFactoryBean(String... packagesToScan) throws ConnectionException{
		
		LocalSessionFactoryBean sessionFactory;
		
		try {
			sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(getDatasource());
			sessionFactory.setPackagesToScan(packagesToScan);
			sessionFactory.setHibernateProperties(getHibernateProperties());
			return sessionFactory;
		} catch (Exception e) {
			throw new ConnectionException(e);
		}
		
	} 
	
	
	private DataSource getDatasource()throws ConnectionException{
		
		DriverManagerDataSource dataSource;
		//CyberArkCredential credential;
		
		try {
			
			dataSource = new DriverManagerDataSource();
			dataSource.setDriverClassName(properties.getProperty("datasource.driverClassName"));
			
			/*if(properties.getProperty("datasource.appID")!= null) {
				
				credential = CyberArkHandler.LoadDatabankConfig("datasource", properties);
				String databaseName = StringUtils.isBlank(credential.getDatabase())? properties.getProperty("datasource.databaseName"): credential.databaseName));
				dataSource.setUrl(String.format(properties.getProperty("datasource.urlFormat"), credential.getAddress(), credential.getAttribute("PassProps.Port"),databaseName));
				dataSource.setUsername(credential.getUserName());
				dataSource.setPassword(credential.getContent());
				
			}else {*/
				
				dataSource.setUrl(String.format(properties.getProperty("datasource.urlFormat"), properties.getProperty("datasource.address"), properties.getProperty("datasource.connectionPort"),properties.getProperty("datasource.databaseName")));
				dataSource.setUsername(properties.getProperty("datasource.username"));
				dataSource.setPassword(properties.getProperty("datasource.password"));
				
			//}
			
			return dataSource;
			
			
		} catch (Exception e) {
			throw new ConnectionException(e);
		}
		
		
	}
	
	
	private Properties getHibernateProperties()throws ConnectionException{
		
		Properties properties = new Properties();
		
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.show_sql", false);
		properties.put("hibernate.proc.param_null_passing", true);
		properties.put("hibernate.connection.pool_size", 100);
		properties.put("hibernate.current_session_context_class", "thread");
		return properties;
		
	}
	

}
