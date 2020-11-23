package com.hanoli.lista.model;

import com.hanoli.comun.model.HeaderResponse;

public class ConsultarListaResponse {
	
	private HeaderResponse header;
	private ConsultarListaOut body;
	
	
	public HeaderResponse getHeader() {
		return header;
	}
	public void setHeader(HeaderResponse header) {
		this.header = header;
	}
	public ConsultarListaOut getBody() {
		return body;
	}
	public void setBody(ConsultarListaOut body) {
		this.body = body;
	}
	
	

}
