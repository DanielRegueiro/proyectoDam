package modeloVista;

import java.io.Serializable;



public class Habilidad implements Serializable {

	private Long idHabilidad;
	private String descripcion;

	public Long getIdHabilidad() {
		return idHabilidad;
	}

	public void setIdHabilidad(Long idHabilidad) {
		this.idHabilidad = idHabilidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Habilidad() {

	}


}
