package one.digitalinnovationone.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerada via Spring Initlizr
 * Os seguintes módulos foram selecionados
 * - Spring Data Jpa
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * @author Célio Mendes
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
