package com.proyecto.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@Entity
@Table(name="habilidades")
public class Habilidad{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_habilidad")
	private Long id_habilidad;
	@Column(name="descripcion")
	private String descripcion;


	

	public Long getId_habilidad() {
		return id_habilidad;
	}

	public void setId_habilidad(Long id_habilidad) {
		this.id_habilidad = id_habilidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Habilidad() {

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
