package com.hanoli.lista.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LISTATMP")
public class Listatmp implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "CLAVE_DE_HOSPITAL")
	private String claveHospital;

	@Column(name = "CLAVE_DEL_INSUMO")
	private String claveInsumo;

	@Column(name = "NOMBRE_DEL_INSUMO")
	private String nombreInsumo;

	@Column(name = "UNIDAD_DE_MEDIDA_DEL_INSUMO")
	private String unidadMedidaInsumo;

	@Column(name = "IMPORTE_UNITARIO_DEL_INSUMO")
	private String importeUnitarioInsumo;

	@Column(name = "DESCUENTO_POR_INSUMO")
	private String descuentoInsumo;

	@Column(name = "IVA_DEL_INSUMO")
	private String ivaInsumo;

	@Column(name = "FECHA_INICIO_DE_VIGENCIA")
	private String fechaInicioVigencia;

	@Column(name = "FECHA_FIN_DE_VIGENCIA")
	private String fechaFinVigencia;

	@Column(name = "CLAVE_DEPARTAMENTO")
	private String claveDepartamento;

	@Column(name = "ID_MOTIVO_CAMBIO")
	private String idMotivoCambio;

	@Column(name = "ERROR_DESCRIPCION")
	private String errorDescripcion;

	@Column(name = "FECHA_CARGA")
	private String fechaCarga;

	@Column(name = "ID_PETICION")
	private String idPeticion;

	@Column(name = "USUARIO")
	private String usuario;

	public String getClaveHospital() {
		return claveHospital;
	}

	public void setClaveHospital(String claveHospital) {
		this.claveHospital = claveHospital;
	}

	public String getClaveInsumo() {
		return claveInsumo;
	}

	public void setClaveInsumo(String claveInsumo) {
		this.claveInsumo = claveInsumo;
	}

	public String getNombreInsumo() {
		return nombreInsumo;
	}

	public void setNombreInsumo(String nombreInsumo) {
		this.nombreInsumo = nombreInsumo;
	}

	public String getUnidadMedidaInsumo() {
		return unidadMedidaInsumo;
	}

	public void setUnidadMedidaInsumo(String unidadMedidaInsumo) {
		this.unidadMedidaInsumo = unidadMedidaInsumo;
	}

	public String getImporteUnitarioInsumo() {
		return importeUnitarioInsumo;
	}

	public void setImporteUnitarioInsumo(String importeUnitarioInsumo) {
		this.importeUnitarioInsumo = importeUnitarioInsumo;
	}

	public String getDescuentoInsumo() {
		return descuentoInsumo;
	}

	public void setDescuentoInsumo(String descuentoInsumo) {
		this.descuentoInsumo = descuentoInsumo;
	}

	public String getIvaInsumo() {
		return ivaInsumo;
	}

	public void setIvaInsumo(String ivaInsumo) {
		this.ivaInsumo = ivaInsumo;
	}

	public String getFechaInicioVigencia() {
		return fechaInicioVigencia;
	}

	public void setFechaInicioVigencia(String fechaInicioVigencia) {
		this.fechaInicioVigencia = fechaInicioVigencia;
	}

	public String getFechaFinVigencia() {
		return fechaFinVigencia;
	}

	public void setFechaFinVigencia(String fechaFinVigencia) {
		this.fechaFinVigencia = fechaFinVigencia;
	}

	public String getClaveDepartamento() {
		return claveDepartamento;
	}

	public void setClaveDepartamento(String claveDepartamento) {
		this.claveDepartamento = claveDepartamento;
	}

	public String getIdMotivoCambio() {
		return idMotivoCambio;
	}

	public void setIdMotivoCambio(String idMotivoCambio) {
		this.idMotivoCambio = idMotivoCambio;
	}

	public String getErrorDescripcion() {
		return errorDescripcion;
	}

	public void setErrorDescripcion(String errorDescripcion) {
		this.errorDescripcion = errorDescripcion;
	}

	public String getFechaCarga() {
		return fechaCarga;
	}

	public void setFechaCarga(String fechaCarga) {
		this.fechaCarga = fechaCarga;
	}

	public String getIdPeticion() {
		return idPeticion;
	}

	public void setIdPeticion(String idPeticion) {
		this.idPeticion = idPeticion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	

}
