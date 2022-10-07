package Projeto.Java.Maven.Spring;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

	public int somar(int numero1, int numero2) {
		
		System.out.println("passo 2");
		
		return numero1 + numero2;
		
	}
}
