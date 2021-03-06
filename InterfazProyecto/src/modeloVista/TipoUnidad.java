package modeloVista;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;



public class TipoUnidad implements Serializable {
	@SerializedName("idtipo")
	private int idTipoUnidad;
	private String descripcion;

	public int getIdTipoUnidad() {
		return idTipoUnidad;
	}

	public void setIdTipoUnidad(int idTipoUnidad) {
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

	@Override
	public String toString() {
		return "TipoUnidad [idTipoUnidad=" + idTipoUnidad + ", descripcion=" + descripcion + "]";
	}

	
}
