package com.proyecto.modelo.usuario;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.proyecto.modelo.Arma;
import com.proyecto.modelo.Unidad;
@Entity
@Table(name = "lista")
public class Lista {
	
private String nombre;
private int coste;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "id_lista")
private Long id;

@OneToMany (cascade = {CascadeType.ALL})
private List<UnidadesSel> unidadesSel;

public int getCoste() {
	return coste;
}

public void setCoste(int coste) {
	this.coste = coste;
}

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

public List<UnidadesSel> getUnidadesSel() {
	return unidadesSel;
}

public void setUnidadesSel(List<UnidadesSel> unidadesSel) {
	this.unidadesSel = unidadesSel;
}



	
}
