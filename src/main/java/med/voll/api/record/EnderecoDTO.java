package med.voll.api.record;

public record EnderecoDTO(
	String logradouro,
	String bairro,
	String cep,
	String cidade,
	String uf,
	String complemento,
	String numero) {
}
