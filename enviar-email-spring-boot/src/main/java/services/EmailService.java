package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.EmailModel;
import repositories.EmailRepositoy;

@Service
public class EmailService {

	@Autowired
	EmailRepositoy emailRepository;

	public void sendEmail(EmailModel emailModel) {
		// TODO Auto-generated method stub
		
		
	}
	
}
