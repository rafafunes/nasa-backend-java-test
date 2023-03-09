package com.nasa.prueba.aspirante.aplicacion.taskscheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.nasa.prueba.aspirante.infraestructura.clientrest.PruebaClienteRest;

@EnableScheduling
@Component
public class PruebaTask {

	@Autowired
	PruebaClienteRest pruebaClientRest;

	@Scheduled(fixedRate = 60000)
	private void executeTask() {
		pruebaClientRest.getDataApiNasa();
	}

}
