package com.proyecto.modelo.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_usuario")
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "contasena")
	private String contasena;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContasena() {
		return contasena;
	}

	public void setContasena(String contasena) {
		this.contasena = contasena;
	}

}
