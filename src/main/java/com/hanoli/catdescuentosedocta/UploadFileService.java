package com.hanoli.catdescuentosedocta;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;


@Path("/app")
public class UploadFileService {
	
	  @GET
	  @Path("/welcome")
	  @Produces(MediaType.TEXT_PLAIN)
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
    
    
	

}
