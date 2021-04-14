package com.hanoli.lista.delegate.impl;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.net.util.Base64;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.hanoli.lista.dao.ListaDAO;
import com.hanoli.lista.delegate.ListaDelegate;

import com.hanoli.lista.entity.Listatmp;
import com.hanoli.lista.model.CargaMasivaDatosIn;
import com.hanoli.lista.model.CargaMasivaDatosOut;
import com.hanoli.lista.model.ConsultarListaIn;
import com.hanoli.lista.model.ConsultarListaOut;
import com.hanoli.lista.model.ListaOut;

@Repository("listaDelegate")
public class ListaDelegateImpl implements ListaDelegate{

	@Autowired
	@Qualifier("listaDAO")
	private ListaDAO listaDAO;
	
	@Override
	public CargaMasivaDatosOut consultarLista(CargaMasivaDatosIn input) {
		
		//ConsultarListaOut consultarListaOut;
		//List<IhCatProveedor> daoResponse = null;
		CargaMasivaDatosOut output = null;
		List<ListaOut> lista = new ArrayList<ListaOut>();
		
		try {
			
			output = new CargaMasivaDatosOut();
			output = listaDAO.consultarListaPorParams(input);
			
			return output;
			
		} catch (Exception e) {
			
		}
		
		return output;
		
		
		
		
	}

	
	public CargaMasivaDatosOut cargaMasivaDatos(CargaMasivaDatosIn input) {
		
		byte[] uncode = null;
		CargaMasivaDatosOut out = new CargaMasivaDatosOut();
		
		uncode = Base64.decodeBase64(input.getFileBase64());
		
		out = readFile(uncode,out,input);
		
		return out;
		
	}
	
	
	public CargaMasivaDatosOut readFile(byte[] uncode,CargaMasivaDatosOut out,CargaMasivaDatosIn input) {
		
	//	String pathFile = "C:\\uploadedFiles\\Lista de Precios Gpo Angeles_ConDepartamento - test3.xlsx"; 
	Listatmp entry = new Listatmp();
	DataFormatter formatter = new DataFormatter();
	Map<String, Integer> mapNombresColumnas = new HashMap<String, Integer>();
	int filaNombresColumnas = 0;
	
	
	//File archivoExcel = new File(pathFile);
	InputStream fis = new ByteArrayInputStream(uncode);
	//abrir el archivo con POI
	Workbook workbook = null;
	try {
		workbook = WorkbookFactory.create(fis);
		
		//Lee la posicion de la primera hoja
		Sheet hoja = workbook.getSheetAt(0);
	
	//Accede a la posicion donde estan las columnas,normalmente es 0
	//Row filaNombresColumna = (sheet).getRow(0);
		Row filaNombresColumna = hoja.getRow(0);
	
	List<String> columnas = new ArrayList<String>();
	List<String> columnaFilter = new ArrayList<String>();
	
	//Obtiene el nombre de las columnas
     for (int cn=filaNombresColumna.getFirstCellNum(); cn<filaNombresColumna.getLastCellNum(); cn++) { 
    	Cell c = filaNombresColumna.getCell(cn); 
        String contenidoCelda = formatter.formatCellValue(c);
    	
        System.out.println("contenidoCelda: " + contenidoCelda);
    
    	  if(!"".equals(contenidoCelda)) {
    		  columnas.add(contenidoCelda);  
    	  }
    	
     } 
	
     
     System.out.println("Se encontraron: " + columnas.size() + " Columnas");
     
	String[] colums = {"Calve de hospital","Clave Departamento","Clave del insumo","Nombre del Insumo","Unidad de medida del insumo","Importe unitario del insumo","Descuento por insumo","IVA del insumo (%)","Fecha Inicio de Vigencia","Fecha Fin de Vigencia","id Motivo del Cambio"};
	
	 	for (int i = 0; i < columnas.size(); i++) {
			if(Arrays.asList(colums).contains(columnas.get(i))){
				//System.out.println("Columna encontrada: " + columnas.get(i));
				columnaFilter.add(columnas.get(i));
			}else {
				System.out.println("No se encontro ninguna columna: ");
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
	while ((filaDatos = hoja.getRow(indiceDatos++)) != null) {
	    //Procesa solo las celdas en base a los "nombres" de esas columnas
	    for (String col : columnaFilter) {
	       //el resultado de mapNombresColumnas.get(col) es el número de columna a leer en este caso, solo se imprime el resultado
	     //  System.out.print(filaDatos.getCell(mapNombresColumnas.get(col)) + " ");
	    	Cell contenidoFila = filaDatos.getCell(mapNombresColumnas.get(col));
	    	
	    	if(contenidoFila != null) {
	    		
	    		switch(col) {
	    		
	    		case "Clave de hospital":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		case "Clave Departamento":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		case "Clave del Insumo":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    		case "Nombre del insumo":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    		case "Unidad de medida del insumo":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		case "Importe unitario del insumo":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		case "Descuento por insumo":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		case "Iva del insumo (%)":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;	
	    			
	    		case "Fecha Inicio de Vigencia":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		case "Fecha Fin de Vigencia":
	    			try {
	    				entry.setClaveHospital(contenidoFila!=null?contenidoFila.getStringCellValue():"");
	    			}catch(Exception e){
	    				out.setMensaje("No tiene el formato correcto");
	    			}
	    			break;
	    			
	    		default:	
	    		
	    		}
	    		
	    		
	    	}
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    System.out.println();
	}  
		
	

	
	
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	return out; 

	
	
	}





	
	
	

}
