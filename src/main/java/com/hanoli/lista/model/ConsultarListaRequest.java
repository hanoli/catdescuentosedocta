package com.hanoli.lista.model;

import com.hanoli.comun.model.HeaderRequest;


public class ConsultarListaRequest {

	private HeaderRequest header;
	private CargaMasivaDatosIn body;
	
	public HeaderRequest getHeader() {
		return header;
	}
	public void setHeader(HeaderRequest header) {
		this.header = header;
	}
	public CargaMasivaDatosIn getBody() {
		return body;
	}
	public void setBody(CargaMasivaDatosIn body) {
		this.body = body;
	}
	
	
	
}
