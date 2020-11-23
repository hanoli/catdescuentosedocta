package com.hanoli.lista.model;

import java.io.Serializable;
import java.util.Date;

public class ListaOut implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String claveproveedor;
	private Date fechainiciovigencia;
	private Date fechafinvigencia;
	private String claveconcepto;
	private String descripcionconcepto;
	private String unidadmedida;
	private Double costoconcepto;
	private Double ivaconcepto;
	private Double costopactado;
	private Double descuentoconvenio;
	private String niveldescuento;
	private String areaconcepto;
	private String estatus;
	private Integer cvEmotivo;
	private String usuario;
	private Date fecharegistro;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClaveproveedor() {
		return claveproveedor;
	}
	public void setClaveproveedor(String claveproveedor) {
		this.claveproveedor = claveproveedor;
	}
	public Date getFechainiciovigencia() {
		return fechainiciovigencia;
	}
	public void setFechainiciovigencia(Date fechainiciovigencia) {
		this.fechainiciovigencia = fechainiciovigencia;
	}
	public Date getFechafinvigencia() {
		return fechafinvigencia;
	}
	public void setFechafinvigencia(Date fechafinvigencia) {
		this.fechafinvigencia = fechafinvigencia;
	}
	public String getClaveconcepto() {
		return claveconcepto;
	}
	public void setClaveconcepto(String claveconcepto) {
		this.claveconcepto = claveconcepto;
	}
	public String getDescripcionconcepto() {
		return descripcionconcepto;
	}
	public void setDescripcionconcepto(String descripcionconcepto) {
		this.descripcionconcepto = descripcionconcepto;
	}
	public String getUnidadmedida() {
		return unidadmedida;
	}
	public void setUnidadmedida(String unidadmedida) {
		this.unidadmedida = unidadmedida;
	}
	public Double getCostoconcepto() {
		return costoconcepto;
	}
	public void setCostoconcepto(Double costoconcepto) {
		this.costoconcepto = costoconcepto;
	}
	public Double getIvaconcepto() {
		return ivaconcepto;
	}
	public void setIvaconcepto(Double ivaconcepto) {
		this.ivaconcepto = ivaconcepto;
	}
	public Double getCostopactado() {
		return costopactado;
	}
	public void setCostopactado(Double costopactado) {
		this.costopactado = costopactado;
	}
	public Double getDescuentoconvenio() {
		return descuentoconvenio;
	}
	public void setDescuentoconvenio(Double descuentoconvenio) {
		this.descuentoconvenio = descuentoconvenio;
	}
	public String getNiveldescuento() {
		return niveldescuento;
	}
	public void setNiveldescuento(String niveldescuento) {
		this.niveldescuento = niveldescuento;
	}
	public String getAreaconcepto() {
		return areaconcepto;
	}
	public void setAreaconcepto(String areaconcepto) {
		this.areaconcepto = areaconcepto;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public Integer getCvEmotivo() {
		return cvEmotivo;
	}
	public void setCvEmotivo(Integer cvEmotivo) {
		this.cvEmotivo = cvEmotivo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public Date getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	
	
	
	
	

}
