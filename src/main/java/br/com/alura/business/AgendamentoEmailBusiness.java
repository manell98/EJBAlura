package br.com.alura.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.alura.DAO.AgendamentoEmailDAO;
import br.com.alura.domains.AgendamentoEmail;

@Stateless
public class AgendamentoEmailBusiness {
	
	@Inject
	private AgendamentoEmailDAO agendamentoEmailDAO;
	
	public List<AgendamentoEmail> listaAgendamentosEmail() {	
		
		return agendamentoEmailDAO.listaAgendamentoEmail();
	}
	
	public void salvarAgendamentoEmail(AgendamentoEmail agendamentoEmail) {
		
		agendamentoEmail.setEnviado(false);
		agendamentoEmailDAO.salvarAgendamentoEmail(agendamentoEmail);
	}

}
