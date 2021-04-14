package com.hanoli.lista.dao.impl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import javax.persistence.criteria.CriteriaQuery;
import org.springframework.stereotype.Component;

import com.hanoli.comun.dao.impl.GenericDAOImpl;
import com.hanoli.comun.exception.DAOException;
import com.hanoli.lista.dao.ListaDAO;
import com.hanoli.lista.entity.IhCatProveedor;
import com.hanoli.lista.entity.Listatmp;
import com.hanoli.lista.model.CargaMasivaDatosIn;
import com.hanoli.lista.model.CargaMasivaDatosOut;
import com.hanoli.lista.model.ConsultarListaIn;
import com.hanoli.lista.model.ConsultarListaOut;


@Component("listaDAO")
public class ListaDAOImpl extends GenericDAOImpl<Listatmp,Integer> implements ListaDAO {
	
	
	public CargaMasivaDatosOut consultarListaPorParams(CargaMasivaDatosIn input) throws DAOException {
		return null;
		
		//CargaMasivaDatosOut consultaLista = new CargaMasivaDatosOut();
		
		/*try {
			
			
			Integer id = input.getLista().getId();
			String claveProveedor = input.getLista().getClaveProveedor();
			String fechaFinVigencia = input.getLista().getFechaServicio();
			String claveConcepto = input.getLista().getClaveConcepto();
			String descripcionConcepto = input.getLista().getDescripcionConcepto();
			String estatus = input.getLista().getEstatus();
			
			CriteriaBuilder cb = getSession().getCriteriaBuilder();
			
			CriteriaQuery<Listatmp> consulta = cb.createQuery(Listatmp.class);
		
			Root<Listatmp> rootProductos = consulta.from(Listatmp.class);
			Predicate allQueryAnd = null;
			
			List<Predicate> filtersQuery = new ArrayList<Predicate>();
			List<Listatmp> listaProveedor = new ArrayList<Listatmp>();
			
			if(id != null) {
				
				filtersQuery.add(cb.equal(rootProductos.get("id"), id));
				
			}
			
			if(!filtersQuery.isEmpty()) {
				allQueryAnd = cb.and(filtersQuery.toArray(new Predicate[filtersQuery.size()]));
				consulta.select(rootProductos).where(allQueryAnd);
				
				listaProveedor = getSession().createQuery(consulta).getResultList();
				
				if(!listaProveedor.isEmpty()) {
					
					consultaLista.setLista(listaProveedor);
					
				}else {
					consultaLista.setMensajeConsulta("No se encontraron datos.");
				}
			}else {
				consultaLista.setMensajeConsulta("Se debe enviar almenos un parametro");
			}
			
			
			return consultaLista;
			
			
		} catch (Exception e) {
			System.out.println(e);
			throw new DAOException(e);
		}finally {
			
			closeTransaction();
		}*/
		
	}

	
	
	

}
