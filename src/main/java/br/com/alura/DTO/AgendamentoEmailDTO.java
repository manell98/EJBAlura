package br.com.alura.DTO;

import java.io.Serializable;

import br.com.alura.domains.AgendamentoEmail;

public class AgendamentoEmailDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String email;
	private String assunto;
	private String mensagem;	
	private Boolean enviado;
	
	public AgendamentoEmailDTO() {
	}

	public AgendamentoEmailDTO(AgendamentoEmail agendamentoEmail) {
		id = agendamentoEmail.getId();
		email = agendamentoEmail.getEmail();
		assunto = agendamentoEmail.getAssunto();
		mensagem = agendamentoEmail.getMensagem();
		enviado = agendamentoEmail.getEnviado();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Boolean getEnviado() {
		return enviado;
	}

	public void setEnviado(Boolean enviado) {
		this.enviado = enviado;
	}
}
