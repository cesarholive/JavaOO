// extends herda atributos da classe funcionárioautenticavel
public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() { // metodo para somar 10% no salario em caso de bonificação.
		System.out.println("bonificacao gerente");
		return super.getBonificacao() + super.getSalario(); // super é utilizado no lugar do this pois o atributo
															// salario é da classe mãe
	}

}
