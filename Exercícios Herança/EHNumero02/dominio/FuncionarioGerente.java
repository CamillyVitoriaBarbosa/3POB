package dominio;

public class FuncionarioGerente extends Funcionario {
	protected float gratificacao;
	
	public FuncionarioGerente(String matricula, String cpf, String nome, float salario, float gratificacao) {
		super(matricula,cpf,nome,salario);
		this.gratificacao = gratificacao;
	}
	
	public float getGratificacao() {
		return gratificacao;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Gratificação: " + gratificacao);
	}
}
