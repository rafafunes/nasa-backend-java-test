package com.nasa.prueba.aspirante.infraestructura.restcontroller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.service.IPruebaService;

@RestController
public class PruebaRestController {

	@Autowired
	IPruebaService pruebaService;

	@GetMapping(value = "/get-data-api-nasa", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getDataDb() {
		List<PruebaEntity> result = pruebaService.findAllData();
		Collections.reverse(result);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
