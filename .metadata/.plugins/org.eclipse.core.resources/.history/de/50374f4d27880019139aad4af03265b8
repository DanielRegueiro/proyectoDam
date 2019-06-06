package com.proyecto.modelo;


import java.util.List;

import java.util.ArrayList;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Table;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

@Entity
@Table(name = "unidad")
public class Unidad {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id_unidad")
	private Long id_unidad;
	@Column(name="nombre")
	private String nombre;
	@Column(name="movimiento")
	private int movimiento;
	@Column(name="habilidad_ataque")
	private int habilidad_ataque;
	@Column(name="habilidad_proyectiles")
	private int habilidad_proyectiles;
	@Column(name="fuerza")
	private int fuerza;
	@Column(name="resistencia")
	private int resistencia;
	@Column(name="heridas")
	private int heridas;
	@Column(name="ataques")
	private int ataques;
	@Column(name="liderazgo")
	private int liderazgo;
	@Column(name="salvacion")
	private int salvacion;
	@Column(name="puntos")
	private int puntos;
	@Column(name="poder")
	private int poder;

	@ManyToOne
	@JoinColumn(name = "id_tipo_unidad")
	private TipoUnidad tipoUnidad;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "armas_unidad", joinColumns = @JoinColumn(name = "id_unidad_armas", referencedColumnName = "id_unidad"), 
	inverseJoinColumns = @JoinColumn(name = "id_arma_armas", referencedColumnName = "id_arma"))
	private List<Arma> listaArmas = new ArrayList<Arma> ();

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "habilidades_unidad", joinColumns = @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad"), 
	inverseJoinColumns = @JoinColumn(name = "id_habilidad", referencedColumnName = "id_habilidad"))
	private List<Habilidad> habilidades = new ArrayList<Habilidad>();

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "reliquias_unidad", joinColumns = @JoinColumn(name = "id_unidad", referencedColumnName = "id_unidad"), 
	inverseJoinColumns = @JoinColumn(name = "id_reliquias", referencedColumnName = "id_reliquia"))
	private List<Reliquia> reliquias=new ArrayList<Reliquia>();



	public Long getId_unidad() {
		return id_unidad;
	}

	public void setId_unidad(Long id_unidad) {
		this.id_unidad = id_unidad;
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

	public int getHabilidad_ataque() {
		return habilidad_ataque;
	}

	public void setHabilidad_ataque(int habilidad_ataque) {
		this.habilidad_ataque = habilidad_ataque;
	}

	public int getHabilidad_proyectiles() {
		return habilidad_proyectiles;
	}

	public void setHabilidad_proyectiles(int habilidad_proyectiles) {
		this.habilidad_proyectiles = habilidad_proyectiles;
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

	public List<Arma> getListaArmas() {
		return listaArmas;
	}

	public void setListaArmas(List<Arma> listaArmas) {
		this.listaArmas = listaArmas;
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

	@Override
	public final boolean equals(final Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	public Unidad() {

	}

}
