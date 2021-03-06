package com.proyecto.modelo.usuario;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany (cascade = {CascadeType.ALL})
	private List<Lista> lista;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Lista> getListas() {
		return lista;
	}

	public void setListas(List<Lista> listas) {
		this.lista = listas;
	}

	
	
}
