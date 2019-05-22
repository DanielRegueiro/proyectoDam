package com.proyecto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@Entity
public class Arma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_arma")
	private Long id_arma;
	@Column(name="descripcion")
	private String descripcion;
	
	@ManyToOne
	@JoinColumn(name = "id_tipo_arma")
	private TipoArma tipoArma;
	@Column(name="puntos")
	private int puntos;

	
	public Long getId_arma() {
		return id_arma;
	}

	public void setId_arma(Long id_arma) {
		this.id_arma = id_arma;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoArma getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public Arma() {

	}

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}
}
