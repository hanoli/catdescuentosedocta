package com.hanoli.comun.model;

import com.google.common.base.Objects;

public class DatosPeticion {

	private String idUsuario;
	private String idServicio;
	private String versionServicio;
	private String versionEndpoint;
	
	public DatosPeticion idUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
		return this;
	}
	
	public String getidUsuario() {
		return idUsuario;
	}
	public void setidUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public DatosPeticion idServicio(String idServicio) {
		this.idServicio = idServicio;
		return this;
	}
	
	public String getidServicio() {
		return idServicio;
	}
	public void setidServicio(String idServicio) {
		this.idServicio = idServicio;
	}
	
	
	public DatosPeticion versionServicio(String versionServicio) {
		this.versionServicio = versionServicio;
		return this;
	}
	
	
	public String getversionServicio() {
		return versionServicio;
	}
	public void setversionServicio(String versionServicio) {
		this.versionServicio = versionServicio;
	}
	
	
	public DatosPeticion versionEndpoint(String versionEndpoint) {
		this.versionEndpoint = versionEndpoint;
		return this;
	}
	
	public String getversionEndpoint() {
		return versionEndpoint;
	}
	public void setversionEndpoint(String versionEndpoint) {
		this.versionEndpoint = versionEndpoint;
	}
	
	
	
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		
		if(o==null || getClass() != o.getClass()) {
			return false;
		}
		
		
		DatosPeticion DatosPeticion = (DatosPeticion) o;
		return Objects.equal(this.idUsuario, DatosPeticion.idUsuario)
				&& Objects.equal(this.idServicio, DatosPeticion.idServicio)
				&& Objects.equal(this.versionServicio, DatosPeticion.versionServicio)
				&& Objects.equal(this.versionEndpoint, DatosPeticion.versionEndpoint);
				
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hashCode(idUsuario,idServicio,versionServicio,versionEndpoint);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DatosPeticion {\n");
		sb.append(" idUsuario: ").append(toIndentedString(idUsuario)).append("\n");
		sb.append(" idServicio: ").append(toIndentedString(idServicio)).append("\n");
		sb.append(" versionServicio: ").append(toIndentedString(versionServicio)).append("\n");
		sb.append(" versionEndpoint: ").append(toIndentedString(versionEndpoint)).append("\n");
		sb.append("}");
		return sb.toString();
	}
	
	
	private String toIndentedString(Object o) {
		
		if(o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n  ");
	}
	
}
