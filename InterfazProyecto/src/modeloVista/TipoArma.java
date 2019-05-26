package modeloVista;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;




public class TipoArma implements Serializable {
	@SerializedName("id_tipo_arma")
	private int idTipoArma;
	
	private String descripcion;

	
	public int getId_tipo() {
		return idTipoArma;
	}

	public void setId_tipo(int id_tipo) {
		idTipoArma = id_tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "TipoArma [idTipoArma=" + idTipoArma + ", descripcion=" + descripcion + "]";
	}

	public TipoArma() {

	}

	
}
