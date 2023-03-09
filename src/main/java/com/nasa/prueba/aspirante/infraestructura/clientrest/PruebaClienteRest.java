package com.nasa.prueba.aspirante.infraestructura.clientrest;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nasa.prueba.aspirante.dominio.dto.ItemDto;
import com.nasa.prueba.aspirante.dominio.dto.PruebaDto;
import com.nasa.prueba.aspirante.dominio.entities.PruebaEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.PruebaInterfaz;

@Component
public class PruebaClienteRest {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	PruebaInterfaz iPruebaInterfaz;

	ObjectMapper mapper = new ObjectMapper();

	String uriApiRest = "https://images-api.nasa.gov/search?q=apollo 11";

	public void getDataApiNasa() {
		try {
			ResponseEntity<String> response = restTemplate.getForEntity(uriApiRest, String.class);
			PruebaDto pruebaDto = mapper.readValue(response.getBody(), PruebaDto.class);
			if (response.getStatusCodeValue() == 200) {
				// se guarda solo el primer elemento
				if (pruebaDto.getCollection().getItems().size() > 0) {
					ItemDto item = pruebaDto.getCollection().getItems().get(0);
					
					PruebaEntity pruebaEntity = new PruebaEntity();
					pruebaEntity.setHref(item.getHref());
					if (item.getData().size() > 0) {
						pruebaEntity.setCenter(item.getData().get(0).getCenter());
						pruebaEntity.setTitle(item.getData().get(0).getTitle());
						pruebaEntity.setNasaId(item.getData().get(0).getNasaId());	
					}
					pruebaEntity.setDateCreate(new Date());
					
					// se guarda
					iPruebaInterfaz.save(pruebaEntity);
	
				}
			}

		} catch (Exception e) {
			System.out.print(e.getMessage());
		}

	}
}
