package modeloVista;

import com.google.gson.annotations.SerializedName;

import modelo.Arma;
import modelo.Habilidad;
import modelo.Reliquia;
import modelo.TipoUnidad;

import java.util.List;




public class Unidad  {
        @SerializedName("idUnidad")
	private Long idUnidad;
	private String nombre;
	private int movimiento;
	private int habilidad_ataque;
	private int habilidad_proyectiles;
	private int fuerza;
	private int resistencia;
	private int heridas;
	private int ataques;
	private int liderazgo;
	private int salvacion;
	private int puntos;
	private int poder;

	private TipoUnidad tipoUnidad;

	private List<Arma> armas;

	private List<Habilidad> habilidades;

	private List<Reliquia> reliquias;

	public Long getIdUnidad() {
		return idUnidad;
	}

	public void setIdUnidad(Long idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(int movimiento) {
		this.movimiento = movimiento;
	}

	public int getHabilidadAtaque() {
		return habilidad_ataque;
	}

	public void setHabilidadAtaque(int habilidadAtaque) {
		this.habilidad_ataque = habilidadAtaque;
	}

	public int getHabilidadProyectiles() {
		return habilidad_proyectiles;
	}

	public void setHabilidadProyectiles(int habilidadProyectiles) {
		this.habilidad_proyectiles = habilidadProyectiles;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getHeridas() {
		return heridas;
	}

	public void setHeridas(int heridas) {
		this.heridas = heridas;
	}

	public int getAtaques() {
		return ataques;
	}

	public void setAtaques(int ataques) {
		this.ataques = ataques;
	}

	public int getLiderazgo() {
		return liderazgo;
	}

	public void setLiderazgo(int liderazgo) {
		this.liderazgo = liderazgo;
	}

	public int getSalvacion() {
		return salvacion;
	}

	public void setSalvacion(int salvacion) {
		this.salvacion = salvacion;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public TipoUnidad getTipoUnidad() {
		return tipoUnidad;
	}

	public void setTipoUnidad(TipoUnidad tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

	public List<Arma> getArmas() {
		return armas;
	}

	public void setArmas(List<Arma> armas) {
		this.armas = armas;
	}

	public List<Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public List<Reliquia> getReliquias() {
		return reliquias;
	}

	public void setReliquias(List<Reliquia> reliquias) {
		this.reliquias = reliquias;
	}

	

	public Unidad() {

	}

}