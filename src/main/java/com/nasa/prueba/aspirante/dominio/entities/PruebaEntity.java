package com.nasa.prueba.aspirante.dominio.entities;

import java.util.Comparator;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_images")
public class PruebaEntity implements Comparable<PruebaEntity> {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_image", nullable = false)
	private Integer idImage;

	@Column(name = "href")
	private String href;

	@Column(name = "center")
	private String center;

	@Column(name = "title")
	private String title;

	@Column(name = "nasa_id")
	private String nasaId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_create")
	private Date dateCreate;

	public Integer getIdImage() {
		return idImage;
	}

	public void setIdImage(Integer idImage) {
		this.idImage = idImage;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

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

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Override
	public int compareTo(PruebaEntity toCompare) {
		return Comparator.comparing(PruebaEntity::getIdImage).compare(this, toCompare);
	}
	
}
