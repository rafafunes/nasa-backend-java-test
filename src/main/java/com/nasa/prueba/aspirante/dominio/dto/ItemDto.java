package com.nasa.prueba.aspirante.dominio.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDto {

	private String href;
	private List<ImageDataDto> data;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public List<ImageDataDto> getData() {
		return data;
	}

	public void setData(List<ImageDataDto> data) {
		this.data = data;
	}

}
