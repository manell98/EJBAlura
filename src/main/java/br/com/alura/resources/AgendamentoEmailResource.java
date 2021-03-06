package br.com.alura.resources;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.alura.DTO.AgendamentoEmailDTO;
import br.com.alura.business.AgendamentoEmailBusiness;
import br.com.alura.domains.AgendamentoEmail;

@Path("/agendamentoemail")
public class AgendamentoEmailResource {
	
	@Inject
	private AgendamentoEmailBusiness agendamentoEmailBusiness;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarAgendamentoEmail() {
		
		List<AgendamentoEmail> emails = agendamentoEmailBusiness.listaAgendamentosEmail();
		List<AgendamentoEmailDTO> emailsDTO = emails.stream().map(obj -> new AgendamentoEmailDTO(obj)).collect(Collectors.toList());
		
		return Response.ok(emailsDTO).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvarAgendamentoEmail(AgendamentoEmail agendamentoEmail) {
		
		agendamentoEmailBusiness.salvarAgendamentoEmail(agendamentoEmail);
		
		return Response.status(201).build();
	}
	
}
