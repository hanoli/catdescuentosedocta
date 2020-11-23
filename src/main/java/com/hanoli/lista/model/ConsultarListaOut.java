package com.hanoli.lista.model;

import java.util.List;

import com.hanoli.lista.entity.IhCatProveedor;

public class ConsultarListaOut {
	
	private List<IhCatProveedor> lista;
	private String mensajeConsulta;
	private String invalidRowsBase64;
	
	
	public List<IhCatProveedor> getLista() {
		return lista;
	}
	public void setLista(List<IhCatProveedor> lista) {
		this.lista = lista;
	}
	public String getMensajeConsulta() {
		return mensajeConsulta;
	}
	public void setMensajeConsulta(String mensajeConsulta) {
		this.mensajeConsulta = mensajeConsulta;
	}
	public String getInvalidRowsBase64() {
		return invalidRowsBase64;
	}
	public void setInvalidRowsBase64(String invalidRowsBase64) {
		this.invalidRowsBase64 = invalidRowsBase64;
	}
	
	

}
