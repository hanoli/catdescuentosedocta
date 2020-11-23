package com.hanoli.lista.delegate;

import com.hanoli.lista.model.ConsultarListaIn;
import com.hanoli.lista.model.ConsultarListaOut;

public interface ListaDelegate {

	public ConsultarListaOut consultarLista(ConsultarListaIn input);
	
}
