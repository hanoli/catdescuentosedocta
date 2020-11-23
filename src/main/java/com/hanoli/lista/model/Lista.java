package com.hanoli.lista.model;

public class Lista {

	private Integer id;
	private String claveProveedor;
	private String fechaServicio;
	private String claveConcepto;
	private String descripcionConcepto;
	private String estatus;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getClaveProveedor() {
		return claveProveedor;
	}
	public void setClaveProveedor(String claveProveedor) {
		this.claveProveedor = claveProveedor;
	}
	
	public String getFechaServicio() {
		return fechaServicio;
	}
	public void setFechaServicio(String fechaServicio) {
		this.fechaServicio = fechaServicio;
	}
	
	public String getClaveConcepto() {
		return claveConcepto;
	}
	public void setClaveConcepto(String claveConcepto) {
		this.claveConcepto = claveConcepto;
	}
	
	public String getDescripcionConcepto() {
		return descripcionConcepto;
	}
	public void setDescripcionConcepto(String descripcionConcepto) {
		this.descripcionConcepto = descripcionConcepto;
	}
	
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	
	
	
	
	
}
