// extends herda atributos da classe funcionário, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}

	public double getBonificacao() { // metodo para somar 10% no salario em caso de bonificação.
		System.out.println("bonificacao gerente");
		return super.getBonificacao() + super.getSalario(); // super é utilizado no lugar do this pois o atributo
															// salario é da classe mãe
	}

}
