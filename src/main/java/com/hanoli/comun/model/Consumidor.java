package com.hanoli.comun.model;

import com.google.common.base.Objects;

public class Consumidor {
	
	private String ipServer;
	private String ipCliente;
	private String idCanal;
	private String idAplicacion;
	private String idSesion;
	private String idOperacion;
	
	public Consumidor ipServer(String ipServer) {
		this.ipServer = ipServer;
		return this;
	}
	
	public String getIpServer() {
		return ipServer;
	}
	public void setIpServer(String ipServer) {
		this.ipServer = ipServer;
	}
	
	public Consumidor ipCliente(String ipCliente) {
		this.ipCliente = ipCliente;
		return this;
	}
	
	public String getIpCliente() {
		return ipCliente;
	}
	public void setIpCliente(String ipCliente) {
		this.ipCliente = ipCliente;
	}
	
	
	public Consumidor idCanal(String idCanal) {
		this.idCanal = idCanal;
		return this;
	}
	
	
	public String getIdCanal() {
		return idCanal;
	}
	public void setIdCanal(String idCanal) {
		this.idCanal = idCanal;
	}
	
	
	public Consumidor idAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
		return this;
	}
	
	public String getIdAplicacion() {
		return idAplicacion;
	}
	public void setIdAplicacion(String idAplicacion) {
		this.idAplicacion = idAplicacion;
	}
	
	public Consumidor idSesion(String idSesion) {
		this.idSesion = idSesion;
		return this;
	}
	
	
	public String getIdSesion() {
		return idSesion;
	}
	public void setIdSesion(String idSesion) {
		this.idSesion = idSesion;
	}
	
	public Consumidor idOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
		return this;
	}
	
	
	public String getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(String idOperacion) {
		this.idOperacion = idOperacion;
	}
	
	
	
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		
		if(o==null || getClass() != o.getClass()) {
			return false;
		}
		
		
		Consumidor consumidor = (Consumidor) o;
		return Objects.equal(this.ipServer, consumidor.ipServer)
				&& Objects.equal(this.ipCliente, consumidor.ipCliente)
				&& Objects.equal(this.idCanal, consumidor.idCanal)
				&& Objects.equal(this.idAplicacion, consumidor.idAplicacion)
				&& Objects.equal(this.idSesion, consumidor.idSesion)
				&& Objects.equal(this.idOperacion, consumidor.idOperacion);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hashCode(ipServer,ipCliente,idCanal,idAplicacion,idSesion,idOperacion);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Consumidor {\n");
		sb.append(" ipServer: ").append(toIndentedString(ipServer)).append("\n");
		sb.append(" ipCliente: ").append(toIndentedString(ipCliente)).append("\n");
		sb.append(" idCanal: ").append(toIndentedString(idCanal)).append("\n");
		sb.append(" idAplicacion: ").append(toIndentedString(idAplicacion)).append("\n");
		sb.append(" idSesion: ").append(toIndentedString(idSesion)).append("\n");
		sb.append(" idOperacion: ").append(toIndentedString(idOperacion)).append("\n");
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
