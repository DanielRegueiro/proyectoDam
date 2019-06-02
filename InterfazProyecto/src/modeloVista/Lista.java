package modeloVista;

import java.util.ArrayList;
import java.util.List;



public class Lista {
private String id;
private String nombre;
private int coste;

private List<UnidadesSel> unidadesSel;


public Lista() {
	
	this.id = "";
	unidadesSel=new ArrayList<UnidadesSel>();
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getCoste() {
	return coste;
}

public void setCoste(int coste) {
	this.coste = coste;
}

public List<UnidadesSel> getUnidadesSel() {
	return unidadesSel;
}

public void setUnidadesSel(List<UnidadesSel> unidadesSel) {
	this.unidadesSel = unidadesSel;
}


	
	
}
