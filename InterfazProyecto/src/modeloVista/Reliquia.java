package modeloVista;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;



public class Reliquia implements Serializable {
	@SerializedName("id_reliquia")
	private int idReliquia;
	private String descripcion;

	public int getIdReliquia() {
		return idReliquia;
	}

	public void setIdReliquia(int idReliquia) {
		this.idReliquia = idReliquia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Reliquia [idReliquia=" + idReliquia + ", descripcion=" + descripcion + "]";
	}

	public Reliquia() {
	}


}
