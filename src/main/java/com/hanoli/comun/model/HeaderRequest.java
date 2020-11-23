package com.hanoli.comun.model;

public class HeaderRequest {
	
	private Consumidor consumidor;
	private DatosPeticion datosPeticion;
	private DatosVariables datosVariables;
	
	public Consumidor getConsumidor() {
		return consumidor;
	}
	public void setConsumidor(Consumidor consumidor) {
		this.consumidor = consumidor;
	}
	public DatosPeticion getDatosPeticion() {
		return datosPeticion;
	}
	public void setDatosPeticion(DatosPeticion datosPeticion) {
		this.datosPeticion = datosPeticion;
	}
	public DatosVariables getDatosVariables() {
		return datosVariables;
	}
	public void setDatosVariables(DatosVariables datosVariables) {
		this.datosVariables = datosVariables;
	}
	
	

}
