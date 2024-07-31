package com.corenetworks.practica;

import com.corenetworks.practica.modelo.ejercicio1.Saludo;
import com.corenetworks.practica.modelo.ejercicio2.IEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticaApplication implements CommandLineRunner {
	@Autowired
	Saludo s1;

	@Autowired
	@Qualifier("secretario")
	IEmpleado e1;

	@Autowired
	@Qualifier("d1")
	IEmpleado e2;

	public static void main(String[] args) {

		SpringApplication.run(PracticaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(s1.getMensaje());
		System.out.println(e1.getTarea());
		System.out.println(e1.getInforme());
		System.out.println(e2.getTarea());
		System.out.println(e2.getInforme());
	}
}
