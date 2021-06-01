package com.em.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.demo.converter.Convertidor;
import com.em.demo.entitys.Empleado;
import com.em.demo.entitys.Solicitud;
import com.em.demo.models.MEmpleado;
import com.em.demo.models.MSolicitud;
import com.em.demo.services.Services;
import com.em.demo.services.ServicesSolicitud;

@RestController
@RequestMapping("/inicio")
public class Controller {
	
	@Autowired
	@Qualifier("servicio")
	Services servicios;
	
	@Autowired
	@Qualifier("servicio2")
	ServicesSolicitud servicioss;
	
	@PostMapping("/crearSolicitud")
	public String crearSolicitud
	(@RequestBody @Validated Solicitud solicitud) {			
		return servicioss.crearSolicitud(solicitud);
	}
	
	@PutMapping("/updateSolicitud")
	public String updateSolicitud
	(@RequestBody @Validated Solicitud solicitud) {			
		return servicioss.putSolicitud(solicitud);
	}
	
	@DeleteMapping("/deleteSolicitud/{id}")
	public String deleteSolicitud
	(@PathVariable("id")Long id) {		
		return servicioss.deleteSolicitud(id);
	}
	
	@GetMapping("/getSolicitud/{id}")
	public MSolicitud getSolicitud
	(@PathVariable("id")Long id) {		
		return servicioss.buscarSolicitud(id);
	}
	@GetMapping("/getSolicitud/{id}")
	public List<Solicitud> getAllSolicitud
	() {		
		return servicioss.getSolicitud();
	}
	
	
	
	@PostMapping("/crear")
	public String crearEmpleado
	(@RequestBody @Validated Empleado empleado) {		
		return servicios.crearEmpleado(empleado);
	}
	
	
	@GetMapping("/empleados")
	public List<Empleado> getEmpleados(){
		List<Empleado> empleadosR  = new  ArrayList<>();		
		return empleadosR = servicios.getEmpleados();		
	}
	
	
	@GetMapping("/getEmpleado/{id}")
	public MEmpleado getEmpleado(@PathVariable("id")Long id){			
		return servicios.buscarEmpleado(id);		
	}
	
	@PutMapping("/updateEmpleado")
	public String updateEmpleado(@RequestBody @Validated Empleado empleado){
		return servicios.putEmpleado(empleado);	
	}
	
	@DeleteMapping("/deleteEmpleado/{id}")
	public String updateEmpleado(@PathVariable("id")Long id){
		return servicios.deleteEmpleado(id);
		
	}	
	
	@GetMapping("/test")
	public String test(){	
		return "Conexion correcta";
	}
}
