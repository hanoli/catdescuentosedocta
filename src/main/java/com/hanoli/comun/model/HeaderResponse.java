package com.hanoli.comun.model;

import java.util.Date;

public class HeaderResponse {
	
	private Date fechaHora;
	private String idOperacion;
	private EstadoRespuesta estadoRespuesta;
	
	
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	public EstadoRespuesta getEstadoRespuesta() {
		return estadoRespuesta;
	}
	public void setEstadoRespuesta(EstadoRespuesta estadoRespuesta) {
		this.estadoRespuesta = estadoRespuesta;
	}
	
	
	
	

}
