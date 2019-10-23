package br.com.alura.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

@Stateless
public class AgendamentoEmailBusiness {
	
	public List<String> listaAgendamentosEmail() {
		
		List<String> emails = new ArrayList<>();
		emails.add("email1@gmail.com");
		emails.add("email2@gmail.com");
		emails.add("email3@gmail.com");
		
		return emails;
		
	}

}
