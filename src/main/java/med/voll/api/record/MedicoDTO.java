package med.voll.api.record;

import med.voll.api.enums.EspecilidadeEnum;

public record MedicoDTO(
	String nome, 
	String email, 
	String crm, 
	EspecilidadeEnum especialidade,
	EnderecoDTO endereco) {
}
