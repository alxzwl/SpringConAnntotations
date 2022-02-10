package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ComercialExperimentado implements Empleados {

	// Ejecucion del codigo despues de la creacion del bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras creacion del bean");
	}

	// Ejecucion de codigo despues del apagado del contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutado antes de la destruccion del bean");
	}

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
