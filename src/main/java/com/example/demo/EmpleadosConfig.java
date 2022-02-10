package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo")
public class EmpleadosConfig {

	// Definir el bean para Informe FinancieroDtoCompras

	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {

		return new InformeFinancieroDtoCompras();
	}

	// Definir el bean para un DirectorFinanciero
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}

}
