package com.hanoli.comun.model;

import com.google.common.base.Objects;

public class EstadoRespuesta {
	
	private Boolean estadoOperacion;
	private String respuestaClave;
	private String mensajeAUsuario;
	private String mensajeDetallado;
	
	public EstadoRespuesta estadoOperacion(Boolean estadoOperacion) {
		this.estadoOperacion = estadoOperacion;
		return this;
	}
	
	public Boolean isEstadoOperacion() {
		return estadoOperacion;
	}
	
	public void setEstadoOperacion(Boolean estadoOperacion) {
		this.estadoOperacion = estadoOperacion;
	}
	
	public EstadoRespuesta respuestaClave(String respuestClave) {
		this.respuestaClave = respuestClave;
		return this;
	}
	
	public String getRespuestaClave() {
		return respuestaClave;
	}
	
	public void setRespuestaClave(String respuestaClave) {
		this.respuestaClave = respuestaClave;
	}
	
	
	public EstadoRespuesta mensajeAUsuario(String mensajeAUsuario) {
		this.mensajeAUsuario = mensajeAUsuario;
		return this;
	}
	
	public String getMensajeAUsuario() {
		return mensajeAUsuario;
	}
	public void setMensajeAUsuario(String mensajeAUsuario) {
		this.mensajeAUsuario = mensajeAUsuario;
	}
	

	public EstadoRespuesta mensajeDetallado(String mensajeDetallado) {
		this.mensajeDetallado = mensajeDetallado;
		return this;
	}
	

	public String getMensajeDetallado() {
		return mensajeDetallado;
	}
	public void setMensajeDetallado(String mensajeDetallado) {
		this.mensajeDetallado = mensajeDetallado;
	}
	
	
	
	public boolean equals(Object o) {
	
		if(this == o) {
			return true;
		}
		
		if(o==null || getClass() != o.getClass()) {
			return false;
		}
		
		
		EstadoRespuesta estadoRespuesta = (EstadoRespuesta) o;
		return Objects.equal(this.estadoOperacion, estadoRespuesta.estadoOperacion)
				&& Objects.equal(this.respuestaClave, estadoRespuesta.respuestaClave)
				&& Objects.equal(this.mensajeAUsuario, estadoRespuesta.mensajeAUsuario)
				&& Objects.equal(this.mensajeDetallado, estadoRespuesta.mensajeDetallado);
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hashCode(estadoOperacion,respuestaClave,mensajeAUsuario,mensajeDetallado);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EstadoRespuesta {\n");
		sb.append(" estadoOperacion: ").append(toIndentedString(estadoOperacion)).append("\n");
		sb.append(" respuestaClave: ").append(toIndentedString(respuestaClave)).append("\n");
		sb.append(" mensajeAUsuario: ").append(toIndentedString(mensajeAUsuario)).append("\n");
		sb.append(" mensajeDetallado: ").append(toIndentedString(mensajeDetallado)).append("\n");
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
