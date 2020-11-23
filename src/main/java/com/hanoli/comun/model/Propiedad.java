package com.hanoli.comun.model;

import com.google.common.base.Objects;

public class Propiedad {

	private String nombre;
	private String valor;
	
	public Propiedad nombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Propiedad valor(String valor) {
		this.valor = valor;
		return this;
	}
	
	public String getvalor() {
		return valor;
	}
	public void setvalor(String valor) {
		this.valor = valor;
	}
	
	
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		
		if(o==null || getClass() != o.getClass()) {
			return false;
		}
		
		
		Propiedad Propiedad = (Propiedad) o;
		return Objects.equal(this.nombre, Propiedad.nombre)
				&& Objects.equal(this.valor, Propiedad.valor);
			
				
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hashCode(nombre,valor);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Propiedad {\n");
		sb.append(" nombre: ").append(toIndentedString(nombre)).append("\n");
		sb.append(" valor: ").append(toIndentedString(valor)).append("\n");
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
