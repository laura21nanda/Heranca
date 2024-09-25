package Heranca;

public class PrincipalPessoa {

	public static void main(String[] args) {

		// Criando uma pessoa
		Pessoa pessoa = new Pessoa ("Lucas Fabiano", "(11)1234-5678");
		System.out.println("Pessoa: ");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Telefone: " + pessoa.getTelefone());

		// Criando uma pessoa física
		PessoaFisica fisica = new PessoaFisica("Laura Fernanda","(11)2222-2222","1234-5678","100.200.300.99");
		System.out.println("\n Pessoa Física");
		System.out.println("Nome: " + fisica.getNome());
		System.out.println("Telefone: " + fisica.getTelefone());
		System.out.println("CPF: " + fisica.getCpf());
		System.out.println("RG: " + fisica.getRg());

		// Criando pessoa Juridica
		PessoaJuridica juridica = new PessoaJuridica("Empresa X","(11)9999-9999","12.345.678/9001-23");
		System.out.println("\n Pessoa Juridica");
		System.out.println("Nome: " + juridica.getNome());
		System.out.println("Telefone: " + juridica.getTelefone());
		System.out.println("RG: " + juridica.getCnpj());

	}

}
