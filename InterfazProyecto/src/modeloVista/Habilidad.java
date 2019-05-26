package modeloVista;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;



public class Habilidad implements Serializable {
	@SerializedName("id_habilidad")
	private int idHabilidad;
	private String descripcion;

	public int getIdHabilidad() {
		return idHabilidad;
	}

	public void setIdHabilidad(int idHabilidad) {
		this.idHabilidad = idHabilidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Habilidad [idHabilidad=" + idHabilidad + ", descripcion=" + descripcion + "]";
	}

	public Habilidad() {

	}


}
