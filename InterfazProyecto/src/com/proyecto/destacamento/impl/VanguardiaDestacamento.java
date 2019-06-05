package com.proyecto.destacamento.impl;

import com.proyecto.destacamento.DestacamentoInterface;

public class VanguardiaDestacamento implements DestacamentoInterface {

	@Override
	public String devolverMinimoCG() {
		
		return "1";
	}

	@Override
	public String devolverMinimoTropas() {
		
		return "0";
	}

	@Override
	public String devolverMinimoElite() {
		
		return "3";
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
		
		return "2";
	}

	@Override
	public String devolverMaximoTropas() {
		
		return "3";
	}

	@Override
	public String devolverMaximoElite() {
		
		return "6";
	}

	@Override
	public String devolverMaximoAtaqueRapido() {
		
		return "2";
	}

	@Override
	public String devolverMaximoVoladores() {
		
		return "2";
	}

	@Override
	public String devolverMaximoApoyoPesado() {
		
		return "2";
	}

	@Override
	public String foto() {
		
		return "vanguardia";
	}



}
