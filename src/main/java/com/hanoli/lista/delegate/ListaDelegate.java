package com.hanoli.lista.delegate;

import com.hanoli.lista.model.CargaMasivaDatosIn;
import com.hanoli.lista.model.CargaMasivaDatosOut;
import com.hanoli.lista.model.ConsultarListaIn;
import com.hanoli.lista.model.ConsultarListaOut;

public interface ListaDelegate {

	public CargaMasivaDatosOut consultarLista(CargaMasivaDatosIn cargaMasivaDatosIn);
	public CargaMasivaDatosOut cargaMasivaDatos(CargaMasivaDatosIn consultarListaIn);
	
}
