package com.em.demo.entitys;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Empleado")
@Entity
public class Empleado {
	
	
	
	@GeneratedValue
	@Id
	@Column(name = "ID")
	Long id;
	
	@Column(name = "FECHA_INGRESO")
	Date fechaingreso;
	
	@Column(name = "NOMBRE")
	String nombre;
	
	
	@Column (name = "SALARIO")
	String salario;


	@Override
	public String toString() {
		return "Empleados [id=" + id + ", fechaingreso=" + fechaingreso + ", nombre=" + nombre + ", salario=" + salario
				+ "]";
	}
	
	Empleado(){}

	public Empleado(Long id, Date fechaingreso, String nombre, String salario) {
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
