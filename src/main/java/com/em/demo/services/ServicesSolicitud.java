package com.em.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.em.demo.entitys.Solicitud;
import com.em.demo.models.MSolicitud;
import com.em.demo.repository.Repositorio2;

@Service("servicio2")
public class ServicesSolicitud {

	
	@Autowired
	@Qualifier("repositorio2")
	private Repositorio2 repositorio2;
	
	
	
	private static final Log logger = LogFactory.getLog(ServicesSolicitud.class);
	
	
	public MSolicitud buscarSolicitud(long id) {
		MSolicitud MSolicitud;
		try {
			MSolicitud = repositorio2.findById(id);
										
		}catch(Exception e) {
			logger.error("Hubo un error "+e);
			return null;
		}
		return MSolicitud;				
	}
	
	
	public List<Solicitud> getSolicitud() {
		List<Solicitud> mSolicitud = new ArrayList<>();
		try {
			mSolicitud = repositorio2.findAll();
										
		}catch(Exception e) {
			logger.error("Hubo un error "+e);
			return null;
		}
		return mSolicitud;				
	}
	
	public String  crearSolicitud(Solicitud solicitud) {
	
		try {
			repositorio2.save(solicitud);			
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return e.toString();
		}
		return "Solicitud creada";
	}
	
	
	public String putSolicitud(Solicitud solicitud) {
	
		try {
			repositorio2.save(solicitud);			
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return e.toString();
		}
		return "Empleado Actualizado";
	}
	
	public String  deleteSolicitud(Long id) {		
		
		try {
			repositorio2.deleteById(id);			
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return e.toString();
		}
		return "Solicitud borrado";
	}
	
	
	

	
	
	
	
	
}
