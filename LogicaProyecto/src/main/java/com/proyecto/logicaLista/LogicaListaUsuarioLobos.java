package com.proyecto.logicaLista;

import java.util.ArrayList;

import com.proyecto.destacamento.DestacamentoInterface;
import com.proyecto.modelo.Unidad;

public class LogicaListaUsuarioLobos {
	
private ArrayList<Unidad> unidadesModelo;
private ArrayList<Unidad> unidadesListaUsuario;




private int numeroUnidadesCG;
private int numeroUnidadesTropa;
private int numeroUnidadesElite;
private int numeroUnidadesAtaqueRapido;
private int numeroUnidadesVoladores;
private int numeroUnidadesApoyoPesado;
private int numeroTransportes;

public LogicaListaUsuarioLobos(ArrayList<Unidad> unidadesModelo) {
	super();
	this.unidadesModelo = unidadesModelo;
}

public Unidad[] generarHuecosParaCG(DestacamentoInterface destacamento){
	Unidad[] unidadesCG= new Unidad[destacamento.devolverMaximoCG()];
	
	
	return unidadesCG;
}


}
