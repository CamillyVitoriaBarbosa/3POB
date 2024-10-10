package dominio;

public class Funcionario {
	protected String matricula;
	protected String cpf;
	protected String nome;
	protected float salario;
	
	public Funcionario(String matricula, String cpf, String nome, float salario) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getSalario() {
		return salario;
	}
		
	public void mostrarInfo() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Salário: " + salario);
	}
}
