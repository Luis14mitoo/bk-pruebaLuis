package com.em.demo.entitys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Solicitud")
@Entity
public class Solicitud implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	
	@GeneratedValue
	@Id
	@Column(name = "ID")
	private Long id;
	@Column(name = "CODIGO")
	private String codigo;
	@Column(name = "DESCRIPCION")
	private String descripcion;
	@Column(name = "RESUMEN")
	private String resumen;
	@Column(name = "ID_EMPLEADO")
	private String idempleado;
	
	Solicitud(){}

	public Solicitud(Long id, String codigo, String descripcion, String resumen, String idempleado) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.resumen = resumen;
		this.idempleado = idempleado;
	}

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", codigo=" + codigo + ", descripcion=" + descripcion + ", resumen=" + resumen
				+ ", idempleado=" + idempleado + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(String idempleado) {
		this.idempleado = idempleado;
	}
	
	
	
	
}
