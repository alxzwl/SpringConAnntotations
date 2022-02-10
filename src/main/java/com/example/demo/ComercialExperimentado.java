package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ComercialExperimentado implements Empleados {

	public ComercialExperimentado() {

	}

	/*
	 * @Autowired public ComercialExperimentado(CreacionInformeFinanciero
	 * nuevoInforme) { this.nuevoInforme = nuevoInforme; }
	 */

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender y vender mas";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		// return "Esto es un informe generado por el comercial";
		return nuevoInforme.getInformeFinanciero();
	}

	// @Autowired
	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}

	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInforme;

}
