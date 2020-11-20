package com.hanoli.catdescuentosedocta;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.hanoli.comun.AppConfig;
import com.hanoli.comun.connection.Hibernate;
import com.hanoli.comun.exception.UtilsException;
import com.hanoli.comun.utils.Constants;

public class ApplicationConfig extends AppConfig {

	
	@Bean(name = "datasourceProperties")
	public Properties getDatasourceProperties() throws UtilsException{
		
		try {
		return getProperties("datasource", Constants.CYBER_ARK_CONFIG, Constants.DATASOURCE_CONFIG);
		}catch(Exception e) {
			throw new UtilsException(e);
		}
	}

	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean getSessionFactory() throws UtilsException{
		try {
		return (new Hibernate(getDatasourceProperties())).getLocalSessionFactoryBean("com.hanoli.catdescuentosedocta.entity");
		}catch(Exception e) {
			throw new UtilsException(e);
		}
	}
	
	
}
