package modeloVista;

import java.io.Serializable;




public class TipoArma implements Serializable {

	private Long idTipoArma;
	private String Descripcion;

	
	public Long getId_tipo() {
		return idTipoArma;
	}

	public void setId_tipo(Long id_tipo) {
		idTipoArma = id_tipo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public TipoArma() {

	}

	
}
