package modeloVista;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String contrasena;
	private ArrayList<Lista> listas;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public ArrayList<Lista> getListas() {
		return listas;
	}
	public void setListas(ArrayList<Lista> listas) {
		this.listas = listas;
	}
	@Override
	public String toString() {
		return "Usuario [nombre= " + nombre + ", contraseÑa= " + contrasena + ", listas= " + listas + "]";
	}
	
	
	
	
}
