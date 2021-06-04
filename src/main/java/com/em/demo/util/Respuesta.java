package com.em.demo.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.em.demo.util.GeneralResponse;
import com.em.demo.entitys.Empleado;

@Component
public class Respuesta {
	

	public   ResponseEntity<GeneralResponse> response(String mensaje){
		return ResponseEntity.status(HttpStatus.OK).body(new GeneralResponse(mensaje));
	}
	public   ResponseEntity<GeneralResponse> responseList(List<Empleado> empleados){
		return ResponseEntity.status(HttpStatus.OK).body(new GeneralResponse(empleados));
	}

}
