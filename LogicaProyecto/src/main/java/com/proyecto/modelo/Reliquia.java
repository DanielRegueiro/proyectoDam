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
@Table(name="reliquias")
public class Reliquia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_reliquia")
	private Long id_reliquia;
	@Column(name="descripcion")
	private String descripcion;



	public Long getId_reliquia() {
		return id_reliquia;
	}

	public void setId_reliquia(Long id_reliquia) {
		this.id_reliquia = id_reliquia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Reliquia() {
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
