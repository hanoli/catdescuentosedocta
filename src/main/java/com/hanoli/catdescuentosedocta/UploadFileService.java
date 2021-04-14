package com.hanoli.catdescuentosedocta;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.hanoli.comun.utils.StringUtils;
import com.hanoli.comun.utils.HeaderHandler;
import com.hanoli.lista.delegate.ListaDelegate;
import com.hanoli.lista.model.ConsultarListaRequest;
import com.hanoli.lista.model.ConsultarListaResponse;



@Path("app")
public class UploadFileService {
	
	private ListaDelegate delegate;
	
	public UploadFileService() {
		try {
			delegate = StringUtils.getBean(ListaDelegate.class, ApplicationConfig.class);	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	@GET
	@Path("/welcome")
	@Produces (MediaType.APPLICATION_JSON)
	public String sayPlainTextHello() {
	  return "Hola han";
	}
    
    
    @Path("consultar")
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response consultarLista(ConsultarListaRequest request) {
    	
    	ConsultarListaResponse resp;
    	
    	try {
    		resp = new ConsultarListaResponse();
        	resp.setHeader(HeaderHandler.handleResponseHeader(request.getHeader(), true));
        	resp.setBody(delegate.consultarLista(request.getBody()));
        	return Response.status(Response.Status.OK).entity(resp).build();		
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
		}
    }
    
    
    @Path("cargaMasivaDatos")
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response cargaMasivaDatos(ConsultarListaRequest request) {
    	
    	ConsultarListaResponse resp;
    	
    	try {
    		resp = new ConsultarListaResponse();
        	resp.setHeader(HeaderHandler.handleResponseHeader(request.getHeader(), true));
        	resp.setBody(delegate.cargaMasivaDatos(request.getBody()));
        	return Response.status(Response.Status.OK).entity(resp).build();		
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e).build();
		}
    }
    
    
    
    
	

}
