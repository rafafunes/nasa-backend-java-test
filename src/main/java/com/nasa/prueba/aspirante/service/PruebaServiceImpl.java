package com.nasa.prueba.aspirante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;

@Service
public class PruebaServiceImpl implements IPruebaService {
	@Autowired
	PruebaInterfaz iPruebaInterfaz;

	@Override
	public List<PruebaEntity> findAllData() {
		return iPruebaInterfaz.findAll();
	}
}
