package modeloVista;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

import modeloVista.TipoArma;

public class Arma implements Serializable {

	@SerializedName("id_arma")
	private int idArma;
	private String descripcion;
	private TipoArma tipoArma;
	private int puntos;

	public int getIdArma() {
		return idArma;
	}

	public void setIdArma(int idArma) {
		this.idArma = idArma;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoArma getTipoArma() {
		return tipoArma;
	}

	public void setTipoArma(TipoArma tipoArma) {
		this.tipoArma = tipoArma;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Arma [idArma=" + idArma + ", descripcion=" + descripcion + ", tipoArma=" + tipoArma + ", puntos="
				+ puntos + "]";
	}

	public Arma() {

	}

}
