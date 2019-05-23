package modeloVista;

import java.io.Serializable;



public class Reliquia implements Serializable {

	private Long idReliquia;
	private String descripcion;

	public Long getIdReliquia() {
		return idReliquia;
	}

	public void setIdReliquia(Long idReliquia) {
		this.idReliquia = idReliquia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Reliquia() {
	}


}
