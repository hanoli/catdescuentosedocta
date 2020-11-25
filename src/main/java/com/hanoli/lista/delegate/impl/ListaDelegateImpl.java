package com.hanoli.lista.delegate.impl;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import com.hanoli.lista.dao.ListaDAO;
import com.hanoli.lista.delegate.ListaDelegate;
import com.hanoli.lista.entity.IhCatProveedor;
import com.hanoli.lista.model.ConsultarListaIn;
import com.hanoli.lista.model.ConsultarListaOut;
import com.hanoli.lista.model.ListaOut;

@Repository("listaDelegate")
public class ListaDelegateImpl implements ListaDelegate{

	@Autowired
	@Qualifier("listaDAO")
	private ListaDAO listaDAO;
	
	@Override
	public ConsultarListaOut consultarLista(ConsultarListaIn input) {
		
		//ConsultarListaOut consultarListaOut;
		//List<IhCatProveedor> daoResponse = null;
		ConsultarListaOut output = null;
		List<ListaOut> lista = new ArrayList<ListaOut>();
		
		try {
			
			output = new ConsultarListaOut();
			output = listaDAO.consultarListaPorParams(input);
			
			return output;
			
		} catch (Exception e) {
			
		}
		
		return output;
		
		
		
		
	}

	
	
	
	/*public ConsultarListaOut consultarLista(ConsultarListaIn input) {
		
	try {
		
	
		Integer id = input.getLista().getId();
		String claveProveedor = input.getLista().getClaveProveedor();
		String fechaFinVigencia = input.getLista().getFechaServicio();
		String claveConcepto = input.getLista().getClaveConcepto();
		String descripcionConcepto = input.getLista().getDescripcionConcepto();
		String estatus = input.getLista().getEstatus();
		
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		
		CriteriaQuery<IhCatProveedor> consulta = cb.createQuery(IhCatProveedor.class);
		Root<IhCatProveedor> rootProductos = consulta.from(IhCatProveedor.class);
		Predicate allQueryAnd = null;
		
		List<Predicate> filtersQuery = new ArrayList<Predicate>();
		List<IhCatProveedor> listaProveedor = new ArrayList<IhCatProveedor>();
		ConsultarListaOut consultaLista = new ConsultarListaOut();
		
		if(id != null) {
			filtersQuery.add(cb.equal(rootProductos.get("id"), id));
		}
		
		if((claveProveedor != null)&&(!claveProveedor.isEmpty())) {
			filtersQuery.add(cb.equal(cb.upper(rootProductos.get("claveproveedor")),claveProveedor.toUpperCase()));
		}

		if((fechaFinVigencia != null)&&(!fechaFinVigencia.isEmpty())) {
			Date dateFechaServicio = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(input.getLista().getFechaServicio());
			
			filtersQuery.add(cb.lessThanOrEqualTo(rootProductos.get("fechainiciovigencia").as(Date.class), dateFechaServicio));
			filtersQuery.add(cb.greaterThanOrEqualTo(rootProductos.get("fechafinvigencia").as(Date.class), dateFechaServicio));
			
		}
		
		if((claveConcepto != null) && (!claveConcepto.isEmpty())) {
			
			filtersQuery.add(cb.like(cb.upper(rootProductos.<String>get("claveconcepto")),"%"+claveConcepto.toUpperCase() +"%"));
		}
		
		
		if((descripcionConcepto != null) && (!descripcionConcepto.isEmpty())) {
			
			filtersQuery.add(cb.like(cb.upper(rootProductos.<String>get("descripcionconcepto")),"%"+descripcionConcepto.toUpperCase() +"%"));
		}
		
		if((estatus != null) && (!estatus.isEmpty())) {
			
			filtersQuery.add(cb.like(cb.upper(rootProductos.<String>get("estatus")),"%"+estatus.toUpperCase() +"%"));
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
		// TODO: handle exception
	}finally {
		
		
	}
		
		
		
	}*/

}
