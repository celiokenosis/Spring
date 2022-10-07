package Projeto.Java.Maven.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		System.out.println("Começou...");

		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
		System.out.println("FINALIZADO...");
	}

}
