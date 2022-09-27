// extends herda atributos da classe funcionário
public class Gerente extends Funcionario{


	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() { // metodo para somar 10% no salario em caso de bonificação.
		return super.getBonificacao() + super.getSalario(); // super é utilizado no lugar do this pois o atributo salario é da classe mãe
	}


	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
