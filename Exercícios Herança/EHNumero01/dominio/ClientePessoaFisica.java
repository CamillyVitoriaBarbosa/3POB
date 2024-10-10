package dominio;

public class ClientePessoaFisica extends Cliente {
	protected String cpf;
	protected String nome;
	
	public ClientePessoaFisica(String endereco, String telefone, String cpf, String nome) {
		super(endereco,telefone);
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		super.mostrarInfo();
	}
}
