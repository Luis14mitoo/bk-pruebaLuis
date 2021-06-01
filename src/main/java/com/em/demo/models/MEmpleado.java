package com.em.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.em.demo.entitys.Empleado;


public class MEmpleado {
	
	
	Long id;
	
	
	Date fechaingreso;
	
	
	String nombre;
	
	
	
	String salario;


	@Override
	public String toString() {
		return "Empleados [id=" + id + ", fechaingreso=" + fechaingreso + ", nombre=" + nombre + ", salario=" + salario
				+ "]";
	}
	
	public MEmpleado(){}
	
	public MEmpleado(Empleado E) {		
		this.id 			= E.getId();		
		this.fechaingreso 	= E.getFechaingreso();
		this.nombre 		= E.getNombre();
		this.salario		 = E.getSalario();		
	}
	
	
	public MEmpleado(Long id, Date fechaingreso, String nombre, String salario) {
		super();
		this.id = id;
		this.fechaingreso = fechaingreso;
		this.nombre = nombre;
		this.salario = salario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaingreso() {
		return fechaingreso;
	}

	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	};
	
	
	
	
	
	
	
	

}
