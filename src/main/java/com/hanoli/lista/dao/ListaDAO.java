package com.hanoli.lista.dao;

import com.hanoli.comun.dao.GenericDAO;
import com.hanoli.comun.exception.DAOException;
import com.hanoli.lista.entity.IhCatProveedor;
import com.hanoli.lista.model.ConsultarListaIn;
import com.hanoli.lista.model.ConsultarListaOut;

public interface ListaDAO  extends GenericDAO<IhCatProveedor,Integer>{

	public ConsultarListaOut consultarListaPorParams(ConsultarListaIn input) throws DAOException;
}
