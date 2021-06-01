package com.em.demo.repository;

import java.io.Serializable;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.em.demo.entitys.Empleado;
import com.em.demo.models.MEmpleado;
@Repository("repositorio")
public interface Repositorio extends JpaRepository <Empleado, Serializable>, PagingAndSortingRepository<Empleado, Serializable>{
	
	public abstract MEmpleado findById(long id);
	
	public abstract List<Empleado> findAll();
	
	
	
	

}
