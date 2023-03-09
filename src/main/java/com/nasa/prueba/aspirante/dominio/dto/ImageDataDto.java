package com.nasa.prueba.aspirante.dominio.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageDataDto {

	private String center;
	private String title;
	@JsonProperty("nasa_id")
	private String nasaId;

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNasaId() {
		return nasaId;
	}

	public void setNasaId(String nasaId) {
		this.nasaId = nasaId;
	}

}
