package com.hanoli.comun.utils;

import java.util.Date;
import com.hanoli.comun.model.EstadoRespuesta;
import com.hanoli.comun.model.HeaderRequest;
import com.hanoli.comun.model.HeaderResponse;

public class HeaderHandler {
	
	
	public static void handleRequestHeader(HeaderRequest header) {
		
		try {
			
		} catch (Exception e) {
			
		}
		
	}
	
		public static HeaderResponse handleResponseHeader (HeaderRequest headerRequest, boolean resultado) {
			
			EstadoRespuesta estado;
			HeaderResponse headerResponse = null;
			
			try {
				
				headerResponse = new HeaderResponse();
				estado = new EstadoRespuesta();
				estado.setEstadoOperacion(resultado);
				
				if(resultado) {
					estado.setRespuestaClave("SUCCESS");
					estado.setMensajeAUsuario("Ejecutado satisfactoriamente");
					estado.setMensajeDetallado("La ejecucion se realizo de manera correcta");
				}else {
					estado.setRespuestaClave("ERROR");
					estado.setMensajeAUsuario("Ejecutado con errores");
					estado.setMensajeDetallado("La ejecucion presento errores. Revisa la respuesta para ver el detalle");
					
				}
				
				headerResponse.setFechaHora(new Date());
				headerResponse.setEstadoRespuesta(estado);
				headerResponse.setIdOperacion(headerRequest.getConsumidor().getIdOperacion());
				return headerResponse;
			
			} catch (Exception e) {
				
			}
			return headerResponse;
			
			
		}
	
	
}
