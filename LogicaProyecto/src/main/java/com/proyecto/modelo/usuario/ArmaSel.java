package com.proyecto.modelo.usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "armassel")
public class ArmaSel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	private int numeroIdArma;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumeroIdArma() {
		return numeroIdArma;
	}

	public void setNumeroIdArma(int numeroIdArma) {
		this.numeroIdArma = numeroIdArma;
	}
	
	
	
}
