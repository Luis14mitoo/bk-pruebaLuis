package com.em.demo.models;

import com.em.demo.entitys.Solicitud;

public class MSolicitud {

	private Long id;
	private String codigo;
	private String descripcion;
	private String resumen;
	private String idempleado;
	
	MSolicitud(){}

	public MSolicitud(Long id, String codigo, String descripcion, String resumen, String idempleado) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.resumen = resumen;
		this.idempleado = idempleado;
	}
	
	
	public MSolicitud(Solicitud solicitud) {
		super();
		this.id = solicitud.getId();
		this.codigo = solicitud.getCodigo();
		this.descripcion = solicitud.getDescripcion();
		this.resumen = solicitud.getResumen();
		this.idempleado = solicitud.getIdempleado();
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
