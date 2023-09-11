package com.sistema.sistema;
import pessoas.*;


import javax.xml.crypto.Data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import enums.Salario;

@SpringBootApplication
public class SistemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaApplication.class, args);
		Gerente fun = new Gerente("rayane", "1211", "1221", 0, "gerente", "admin", "admin", "1", "7878", null, Salario.GERENTE);
	 	Menu menu = new Menu();
	  	menu.verificaFuncionario(fun);

	 
	}

}
