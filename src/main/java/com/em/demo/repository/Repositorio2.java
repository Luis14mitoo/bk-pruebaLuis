package com.em.demo.repository;

import java.io.Serializable;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.em.demo.entitys.Empleado;
import com.em.demo.entitys.Solicitud;
import com.em.demo.models.MEmpleado;
import com.em.demo.models.MSolicitud;
@Repository("repositorio2")
public interface Repositorio2 extends JpaRepository <Solicitud, Serializable>{
	
	public abstract MSolicitud findById(long id);
	
	public abstract List<Solicitud> findAll();
	
	
	
	

}
