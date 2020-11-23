package com.hanoli.lista.model;

import com.hanoli.comun.model.HeaderRequest;


public class ConsultarListaRequest {

	private HeaderRequest header;
	private ConsultarListaIn body;
	
	public HeaderRequest getHeader() {
		return header;
	}
	public void setHeader(HeaderRequest header) {
		this.header = header;
	}
	public ConsultarListaIn getBody() {
		return body;
	}
	public void setBody(ConsultarListaIn body) {
		this.body = body;
	}
	
	
	
}
