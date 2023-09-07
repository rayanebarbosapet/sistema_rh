package com.sistema.sistema;
import pessoas.*;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaApplication.class, args);
	
	 Atendente at = new Atendente(null, null, null, 0, null, null, null, null, 0, null, null, null);
	  at.calculoFerias();
	}

}
