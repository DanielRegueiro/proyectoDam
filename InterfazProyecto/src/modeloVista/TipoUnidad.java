package modeloVista;

import java.io.Serializable;



public class TipoUnidad implements Serializable {

	private Long idTipoUnidad;
	private String descripcion;

	public Long getIdTipoUnidad() {
		return idTipoUnidad;
	}

	public void setIdTipoUnidad(Long idTipoUnidad) {
		this.idTipoUnidad = idTipoUnidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoUnidad() {

	}

	
}