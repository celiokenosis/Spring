package repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import models.EmailModel;

public interface EmailRepositoy extends JpaRepository<EmailModel, Long>{

	
	
}
