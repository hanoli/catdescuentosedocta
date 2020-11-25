package com.hanoli.comun;

import java.net.InetAddress;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.hanoli.comun.exception.UtilsException;

@Configuration
@PropertySource("classpath:config.properties")
public class AppConfig {

	@Autowired
	private Environment environment;	
	
	
	
	protected Properties getProperties(String source, String... elements) throws UtilsException {
		
		Properties properties;
		String host;
		String property;
		
		try {
		properties = new Properties();
		host = InetAddress.getLocalHost().getHostName();
		
		for (String element : elements) {
			property = source + "." + element;
			if(environment.getProperty(property)!= null) {
				properties.setProperty(property, environment.getProperty(property));
			}
			
			if(environment.getProperty(host + "." +property)!= null) {
				properties.setProperty(property, environment.getProperty(host + "." +property));
			}
			
		}
		return properties;
		}catch(Exception e) {
			throw new UtilsException(e);
		}
	}
	
	
	protected Properties getProperties(String source, String[]... lists) throws UtilsException {
		
		Properties properties;
		
		try {
		properties = new Properties();
		
		for (String[] list : lists) {
		
			properties.putAll(getProperties(source, list));
			
		}
		return properties;
		}catch(Exception e) {
			throw new UtilsException(e);
		}
	}
	
	
}
