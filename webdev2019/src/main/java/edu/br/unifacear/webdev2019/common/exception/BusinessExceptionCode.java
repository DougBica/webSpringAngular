package edu.br.unifacear.webdev2019.common.exception;

public enum BusinessExceptionCode {
	
	ERR000("Erro não esperado"),
	ERR001("Usuário não encontrado"),
	ERR002("Login ou senha inválidos"),
	ERR003("Email inválido"),
	ERR004("Email já cadastrado"),
	ERR005("CPF inválido"),
	ERR006("Idade minima permitida(18 anos)!!!"),
	ERR007("CPF já cadastrado"),
	ERR008("Data de nascimento invalida"),
	ERR009("Você é muito velho K K K K"),
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
	ERR510("Erro usuario"),
	ERR511("Os campos obrigatórios estão nulos"),
	ERR512("Reserva não vinculada para as passagens"),
	ERR300("Erro não esperado"),
	ERR301("Usuário não encontrado"),
	ERR600("Cancelamento não encontrado!"),
	ERR601("Não foi possivel salvar esse cancelamento!"),
	ERR602("Não foi possivel excluir esse cancalamento!"),
	ERR603("Reserva não encontrada!"),
	ERR604("Passagem não encontrada!"),
	ERR605("Não foi possivel cancelar checkin já efeutado!"),
	ERR606("Remarcação não encontrada!"),
	ERR607("Não foi possivel remarcar!"),
	ERR608("Não foi possivel excluir essa remarcacao!"),
	ERR101("Aeroporto não encontrado"), 
	ERR103("Parada não encontrada"), 
	ERR102("Rota não encontrada"), 
	ERR100("Voo não encontrado");


	private final String message;

	private BusinessExceptionCode(final String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}