package com.em.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.em.demo.converter.Convertidor;
import com.em.demo.entitys.Empleado;
import com.em.demo.models.MEmpleado;
import com.em.demo.repository.Repositorio;

@Service("servicio")
public class Services {

	
	@Autowired
	@Qualifier("repositorio")
	private Repositorio repositorio;
	
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	
	
	private static final Log logger = LogFactory.getLog(Services.class);
	
	
	public MEmpleado buscarEmpleado(long id) {
		MEmpleado mempleado = new MEmpleado();
		try {
			mempleado = repositorio.findById(id);
										
		}catch(Exception e) {
			logger.error("Hubo un error "+e);
			return null;
		}
		return mempleado;				
	}
	
	
		
	
	public String  crearEmpleado(Empleado empleado) {
	
		try {
			repositorio.save(empleado);
			
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return e.toString();
		}
		return "Empleado creado";
	}
	
	
	public String putEmpleado(Empleado empleado) {
	
		try {
			repositorio.save(empleado);
			
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return e.toString();
		}
		return "Empleado Actualizado";
	}
	
	public String  deleteEmpleado(Long id) {		
		
		try {
			repositorio.deleteById(id);			
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return e.toString();
		}
		return "Empleado borrado";
	}
	
	
	
	
	
	
	
	
	
	
	public List<Empleado> getEmpleados(){
		List<Empleado> empleados = new  ArrayList<>();
		try {
			empleados = repositorio.findAll();
			logger.info("Traer todos los empleados *****");
			
		}catch(Exception e ) {
			logger.info("Error ********"+e);
			return null;
		}
		return empleados;
	}
	
	
	
	
	
}
