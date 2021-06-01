package com.em.demo.converter;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.em.demo.entitys.Empleado;
import com.em.demo.models.MEmpleado;



@Component("convertidor")
public class Convertidor {	
	public List<MEmpleado> convertirLista(List<Empleado> empleado){
		List<MEmpleado> mempleadoR = new ArrayList<>();		
			for(Empleado empleadoR: empleado) {
				mempleadoR.add(new MEmpleado(empleadoR));
			}
		return mempleadoR;
	}
	
	
	
}
