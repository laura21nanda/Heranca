package Heranca;

public class PessoaJuridica extends Pessoa{

	private String cnpj;
	
	public PessoaJuridica(String cnpj, String nome, String telefone) {
		super(nome, telefone);
		this.cnpj = cnpj;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
