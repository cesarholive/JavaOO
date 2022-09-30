// extends herda atributos da classe funcionário, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel{

	private int senha;
	
	public double getBonificacao() { // metodo para somar 10% no salario em caso de bonificação.
		System.out.println("bonificacao gerente");
		return super.getBonificacao() + super.getSalario(); // super é utilizado no lugar do this pois o atributo
															// salario é da classe mãe
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
		
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
		return false;
		}
	}

}
