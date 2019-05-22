package com.proyecto.modelo;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@Entity
public class TipoArma {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_tipo_arma")
	private Long id_tipo_arma;
	@Column(name="descripcion")
	private String descripcion;

	
	public Long getId_tipo_arma() {
		return id_tipo_arma;
	}

	public void setId_tipo_arma(Long id_tipo_arma) {
		this.id_tipo_arma = id_tipo_arma;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoArma() {

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
