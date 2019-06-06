package com.proyecto.destacamento.impl;

import com.proyecto.destacamento.DestacamentoInterface;

public class LibreDestacamento implements DestacamentoInterface {

	@Override
	public String devolverMinimoCG() {
		
		return "0";
	}

	@Override
	public String devolverMinimoTropas() {
		
		return "0";
	}

	@Override
	public String devolverMinimoElite() {
		
		return "0";
	}

	@Override
	public String devolverMinimoAtaqueRapido() {
		
		return "0";
	}

	@Override
	public String devolverMinimoVoladores() {
		
		return "0";
	}

	@Override
	public String devolverMinimoApoyoPesado() {
		
		return "0";
	}



	@Override
	public String devolverMaximoCG() {
		
		return "10";
	}

	@Override
	public String devolverMaximoTropas() {
		
		return "10";
	}

	@Override
	public String devolverMaximoElite() {
		
		return "10";
	}

	@Override
	public String devolverMaximoAtaqueRapido() {
		
		return "10";
	}

	@Override
	public String devolverMaximoVoladores() {
		
		return "10";
	}

	@Override
	public String devolverMaximoApoyoPesado() {
		
		return "10";
	}

	@Override
	public String foto() {
		
		return "libre";
	}



}
