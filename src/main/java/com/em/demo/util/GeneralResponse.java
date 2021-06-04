package com.em.demo.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.em.demo.models.MEmpleado;
import com.em.demo.entitys.Empleado;

@Component
public class GeneralResponse {

	
	
	 private String message;
	 private MEmpleado mEmpleado;
	 private List<Empleado> listempleados= new ArrayList<>();
	 
	 public GeneralResponse() {}
	 
	  public GeneralResponse(List<Empleado> listempleados) {		
		this.listempleados = listempleados;
	  } 

	  public List<Empleado> getListempleados() {
		return listempleados;
	  }
	  public void setListempleados(List<Empleado> listempleados) {
		this.listempleados = listempleados;
	  }



	  public GeneralResponse(MEmpleado mEmpleado) {
		 this.mEmpleado = mEmpleado; }
	  
	  public MEmpleado getmEmpleado() {
		return mEmpleado;
	  }
	  public void setmEmpleado(MEmpleado mEmpleado) {
		this.mEmpleado = mEmpleado;
	  }


	  public GeneralResponse(String message) {
	    this.message = message;
	  }

	  public String getMessage() {
	    return message;
	  }
	  public void setMessage(String message) {
	    this.message = message;
	  }
	

}
