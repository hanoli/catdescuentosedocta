package com.hanoli.lista;

import java.util.Properties;


import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.hanoli.comun.AppConfig;
import com.hanoli.comun.connection.Hibernate;
import com.hanoli.comun.exception.ConnectionException;
import com.hanoli.comun.exception.UtilsException;
import com.hanoli.comun.utils.Constants;
import com.hanoli.lista.dao.ListaDAO;
import com.hanoli.lista.dao.impl.ListaDAOImpl;
import com.hanoli.lista.delegate.ListaDelegate;
import com.hanoli.lista.delegate.impl.ListaDelegateImpl;

public class ApplicationConfigX  extends AppConfig{
	
	@Bean(name = "listaDelegate")
	public ListaDelegate getListaDelegate() {
		return new ListaDelegateImpl();
	}
	
	@Bean(name = "listaDAO")
	public ListaDAO getListaDAO() {
		return new ListaDAOImpl();
	}

	
	@Bean(name = "datasourceProperties")
	public Properties getDatasourcePreperties() throws UtilsException {
		return getProperties("datasource", Constants.CYBER_ARK_CONFIG, Constants.DATASOURCE_CONFIG );
	}
	
	
	@Bean(name = "sessionFactory")
	public LocalSessionFactoryBean getSessionFactory() throws ConnectionException, UtilsException {
		return (new Hibernate(getDatasourcePreperties())).getLocalSessionFactoryBean("com.hanoli.lista.entity");
	}
	
	
	
}
