package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leer o cargar el XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Pedir el bean al contenedor
		Empleados antonio = contexto.getBean("comercialExperimentado", Empleados.class);
		// Usar el Bean
		System.out.println(antonio.getInformes());
		System.out.println(antonio.getTareas());

		// Cerrar el contexto
		contexto.close();

	}

}
