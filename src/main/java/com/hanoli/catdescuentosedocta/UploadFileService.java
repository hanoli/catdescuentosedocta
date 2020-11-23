package com.hanoli.catdescuentosedocta;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.hanoli.comun.utils.HeaderHandler;
import com.hanoli.lista.delegate.ListaDelegate;
import com.hanoli.lista.model.ConsultarListaRequest;
import com.hanoli.lista.model.ConsultarListaResponse;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;


@Path("app")
public class UploadFileService {
	
	private ListaDelegate delegate;
	
	  @GET
	  @Path("/welcome")
	  @Produces (MediaType.APPLICATION_JSON)
	  public String sayPlainTextHello() {
	    return "Hola han";
	  }
    
    
    @POST 
    @Path("/upload")  
    @Consumes("multipart/form-data")
    public Response handleDocumentUpload(@FormDataParam("file") InputStream uploadedInputStream,@FormDataParam("file") FormDataContentDisposition fileDetail){
    	
    	String output = null;
    	
    	String uploadedFileLocation = "C://uploadedFiles/" + fileDetail.getFileName(); 
        System.out.println(uploadedFileLocation); 
         
        File objFile=new File(uploadedFileLocation); 
        if(objFile.exists()) 
        { 
         objFile.delete(); 
        } 

        boolean resp =saveToFile(uploadedInputStream, uploadedFileLocation); 

        if(resp) {
        	output = "Archivo cargado con exito: " + uploadedFileLocation;	
        	
        	ReadFile(uploadedFileLocation);
        	
        }
        
        return Response.status(200).entity(output).build(); 
        
    } 
    
    private boolean saveToFile(InputStream uploadedInputStream, 
         String uploadedFileLocation) { 

    	boolean carga = false;
    	
        try { 
         OutputStream out = null; 
         int read = 0; 
         byte[] bytes = new byte[1024]; 

         out = new FileOutputStream(new File(uploadedFileLocation)); 
         while ((read = uploadedInputStream.read(bytes)) != -1) { 
          out.write(bytes, 0, read); 
         } 
         carga=true;
         out.flush(); 
         out.close(); 
        } catch (IOException e) { 
        	carga=false;
         e.printStackTrace(); 
        } 
        
        return carga;

    } 
    
    
    
    public void ReadFile(String pathFile) {
		
    	DataFormatter formatter = new DataFormatter();
		
    	Map<String, Integer> mapNombresColumnas = new HashMap<String, Integer>();

		final int filaNombresColumnas = 0;
		
		File archivoExcel = new File(pathFile);
		//abrir el archivo con POI
		Workbook workbook = null;
		try {
			workbook = WorkbookFactory.create(archivoExcel);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//Lee la posicion de la primera hoja
		Sheet sheet = workbook.getSheetAt(0);
		
		//Accede a la posicion donde estan las columnas,normalmente es 0
		Row filaNombresColumna = sheet.getRow(0);
		
		List<String> columnas = new ArrayList<>();
		
		//Obtiene el nombre de las columnas
	     for (int cn=filaNombresColumna.getFirstCellNum(); cn<filaNombresColumna.getLastCellNum(); cn++) { 
          Cell c = filaNombresColumna.getCell(cn); 
          if (c == null) { 
           // The cell is empty 
          } else { 
           // Process the cell 
        	  String contenidoCelda = formatter.formatCellValue(c);
        	  columnas.add(contenidoCelda);
          } 
        } 
		
		filaNombresColumna.cellIterator().forEachRemaining(cell -> {
		    String valorCelda = cell.getStringCellValue().trim();
		    if (!valorCelda.isEmpty()) {
		        mapNombresColumnas.put(valorCelda, cell.getColumnIndex());
		    }
		});
		
	
		int indiceDatos = filaNombresColumnas + 1;
		Row filaDatos = null;
		//Recorrer todas las filas con datos
		while ((filaDatos = sheet.getRow(indiceDatos++)) != null) {
		    //Procesa solo las celdas en base a los "nombres" de esas columnas
		    for (String col : columnas) {
		       //el resultado de mapNombresColumnas.get(col) es el número de columna a leer en este caso, solo se imprime el resultado
		       System.out.print(filaDatos.getCell(mapNombresColumnas.get(col)) + " ");
		    }
		    
		    System.out.println();
		}
		
	}
    
    
    @Path("consultar")
    @POST
    @Consumes("application/json; charset=UTF-8")
    @Produces("application/json; charset=UTF-8")
    public Response consultarLista(ConsultarListaRequest request) {
    	
    	System.out.println("Llegue a consultar");
    	
    	ConsultarListaResponse resp;
    	
    	try {
    		resp = new ConsultarListaResponse();
        	resp.setHeader(HeaderHandler.handleResponseHeader(request.getHeader(), true));
        	resp.setBody(delegate.consultarLista(request.getBody()));
        	return Response.status(Response.Status.OK).entity(resp).build();		
		} catch (Exception e) {
			
		}
		return null;
    	
    
    	
    }
    
    
	

}
