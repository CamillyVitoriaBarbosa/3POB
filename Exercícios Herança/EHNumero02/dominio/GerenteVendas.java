package dominio;

public class GerenteVendas extends FuncionarioGerente{
	protected float participacaoLucros;
	
	public GerenteVendas(String matricula, String cpf, String nome, float salario, float gratificacao, float participacaoLucros) {
		super(matricula,cpf,nome,salario,gratificacao);
		this.participacaoLucros = participacaoLucros;
	}
	
	public float getParticipacaoLucros() {
		return participacaoLucros;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Participação nos Lucros: " + participacaoLucros);
	}
}
