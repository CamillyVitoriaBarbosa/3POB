package dominio;

public class ClientePessoaJuridica extends Cliente{
	protected String cnpj;
	protected String razaoSocial;
	
	public ClientePessoaJuridica (String endereco, String telefone, String cnpj, String razaoSocial) {
		super(endereco,telefone);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial; 
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Razão Social: " + razaoSocial);
		System.out.println("CNPJ: " + cnpj);
		super.mostrarInfo();
	}
}
