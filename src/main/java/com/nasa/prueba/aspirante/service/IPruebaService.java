package com.nasa.prueba.aspirante.service;

import java.util.List;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;

public interface IPruebaService {
	
	public List<PruebaEntity> findAllData();

}
