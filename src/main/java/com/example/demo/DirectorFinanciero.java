package com.example.demo;

public class DirectorFinanciero implements Empleados {

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	private CreacionInformeFinanciero informeFinanciero;

}
