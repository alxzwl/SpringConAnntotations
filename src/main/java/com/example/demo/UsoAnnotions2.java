package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method

		// Leer o cargar el XML de configuracion
		// ClassPathXmlApplicationContext contexto = new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		// Leer el class de configuracion
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);

		// Pedir beans al contenedor
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);

		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInformes());

		/*
		 * // Pedir el contenedor al bean Empleados Antonio =
		 * contexto.getBean("comercialExperimentado", Empleados.class); Empleados Lucia
		 * = contexto.getBean("comercialExperimentado", Empleados.class);
		 * 
		 * // Apuntan al mismo lugar??
		 * 
		 * if (Antonio == Lucia) {
		 * System.out.println("Apuntan al mismo lugar en memoria");
		 * System.out.println(Antonio + "\n" + Lucia); } else {
		 * System.out.println("No apuntan al mismo lugar en memoria");
		 * System.out.println(Antonio + "\n" + Lucia); }
		 */

		// Cerrar el contexto
		contexto.close();

	}

}
