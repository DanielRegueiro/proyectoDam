package com.proyecto.modelo.usuario;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "lista")
public class Lista {
	
String nombre;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id_lista")
private Long id;

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
	
	
}
