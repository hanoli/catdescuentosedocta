package com.hanoli.lista.model;

import com.hanoli.comun.model.HeaderResponse;

public class ConsultarListaResponse {
	
	private HeaderResponse header;
	private CargaMasivaDatosOut body;
	
	
	public HeaderResponse getHeader() {
		return header;
	}
	public void setHeader(HeaderResponse header) {
		this.header = header;
	}
	public CargaMasivaDatosOut getBody() {
		return body;
	}
	public void setBody(CargaMasivaDatosOut body) {
		this.body = body;
	}
	
	

}
