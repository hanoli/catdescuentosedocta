package com.hanoli.comun.model;

import java.util.List;

import com.google.common.base.Objects;

public class DatosVariables {
	
	private List<Propiedad> propiedad;

	
	public DatosVariables propiedad(List<Propiedad> propiedad) {
		this.propiedad = propiedad;
		return this;
	}
	
	public List<Propiedad> getpropiedad() {
		return propiedad;
	}
	public void setpropiedad(List<Propiedad> propiedad) {
		this.propiedad = propiedad;
	}
	
	
	
	public boolean equals(Object o) {
		
		if(this == o) {
			return true;
		}
		
		if(o==null || getClass() != o.getClass()) {
			return false;
		}
		
		
		DatosVariables DatosVariables = (DatosVariables) o;
		return Objects.equal(this.propiedad, DatosVariables.propiedad);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hashCode(propiedad);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DatosVariables {\n");
		sb.append(" propiedad: ").append(toIndentedString(propiedad)).append("\n");
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
