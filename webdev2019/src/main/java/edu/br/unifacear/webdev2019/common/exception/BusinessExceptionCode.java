package edu.br.unifacear.webdev2019.common.exception;

public enum BusinessExceptionCode {
	
	ERR000("Erro não esperado"),
<<<<<<< HEAD
	ERR001("Usuário não encontrado"),
	ERR002("Login ou senha inválidos"),
	ERR003("Email inválido"),
	ERR004("Email já cadastrado"),
	ERR005("CPF inválido"),
	ERR006("Idade minima permitida(18 anos)!!!"),
	ERR007(""),
	ERR500("Bagagem não encontrada"),
	ERR501("Erro ao inserir bagagem"),
	ERR502("Erro ao alterar bagagem"),
	ERR503("Checkin não encontrado"),
	ERR504("Erro ao inserir checkin"),
	ERR505("Erro ao alterar checkin"),
	ERR506("Erro data"),
	ERR507("Erro passagem"),
	ERR508("Erro voo"),
	ERR509("Erro aeronave"),
	ERR510("Erro usuario");

=======
	ERR001("Usuário não encontrado"),	
	ERR500("A reserva deve conter pelo menos 1 passagem");
	
>>>>>>> feature/passagem
	private final String message;

	private BusinessExceptionCode(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
