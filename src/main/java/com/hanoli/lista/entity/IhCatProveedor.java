package com.hanoli.lista.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "ih_cat_proveedor_precio")
public class IhCatProveedor implements Serializable{

	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="ID")
	private Integer id;

	
	@Column(name = "CLAVEPROVEEDOR")
	private String claveproveedor;
	
	@Column(name = "FECHAINICIOVIGENCIA")
	private String fechainiciovigencia;
	
	@Column(name = "FECHAFINVIGENCIA")
	private String fechafinvigencia;
	
	@Column(name = "CLAVECONCEPTO")
	private String claveconcepto;
	
	@Column(name = "DESCRIPCIONCONCEPTO")
	private String descripcionconcepto;
	
	@Column(name = "UNIDADMEDIDA")
	private String unidadmedida;
	
	@Column(name = "COSTOCONCEPTO")
	private String costoconcepto;
	
	@Column(name = "IVACONCEPTO")
	private String ivaconcepto;
		
	@Column(name = "COSTOPACTADO")
	private String costopactado;
	
	@Column(name = "DESCUENTOCONVENIO")
	private String descuentoconvenio;
	
	@Column(name = "NIVELDESCUENTO")
	private String niveldescuento;
	
	@Column(name = "AREACONCEPTO")
	private String areaconcepto;
	
	@Column(name = "ESTATUS")
	private String estatus;
	
	@Column(name = "CVEMOTIVO")
	private String cvemotivo;
	
	
	@Column(name = "USUARIO")
	private String usuario;
	
	@Column(name = "FECHAREGISTRO")
	private String fecharegistro;

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

	public String getFechainiciovigencia() {
		return fechainiciovigencia;
	}

	public void setFechainiciovigencia(String fechainiciovigencia) {
		this.fechainiciovigencia = fechainiciovigencia;
	}

	public String getFechafinvigencia() {
		return fechafinvigencia;
	}

	public void setFechafinvigencia(String fechafinvigencia) {
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

	public String getCostoconcepto() {
		return costoconcepto;
	}

	public void setCostoconcepto(String costoconcepto) {
		this.costoconcepto = costoconcepto;
	}

	public String getIvaconcepto() {
		return ivaconcepto;
	}

	public void setIvaconcepto(String ivaconcepto) {
		this.ivaconcepto = ivaconcepto;
	}

	public String getCostopactado() {
		return costopactado;
	}

	public void setCostopactado(String costopactado) {
		this.costopactado = costopactado;
	}

	public String getDescuentoconvenio() {
		return descuentoconvenio;
	}

	public void setDescuentoconvenio(String descuentoconvenio) {
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

	public String getCvemotivo() {
		return cvemotivo;
	}

	public void setCvemotivo(String cvemotivo) {
		this.cvemotivo = cvemotivo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(String fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	@Override
	public String toString() {
		return "IhCatProveedorPrecio [claveproveedor=" + claveproveedor + ", fechainiciovigencia="
				+ fechainiciovigencia + ", fechafinvigencia=" + fechafinvigencia + ", claveconcepto=" + claveconcepto
				+ ", descripcionconcepto=" + descripcionconcepto + ", unidadmedida=" + unidadmedida + ", costoconcepto="
				+ costoconcepto + ", ivaconcepto=" + ivaconcepto + ", costopactado=" + costopactado
				+ ", descuentoconvenio=" + descuentoconvenio + ", niveldescuento=" + niveldescuento + ", areaconcepto="
				+ areaconcepto + ", estatus=" + estatus + ", cvemotivo=" + cvemotivo + ", usuario=" + usuario
				+ ", fecharegistro=" + fecharegistro + "]";
	}
	
	
	
	
	
}
