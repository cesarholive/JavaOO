// extends herda atributos da classe funcionário
public class EditorVideo extends Funcionario{

	public double getBonificacao() {
		System.out.println("Bonificacao editor");// metodo para somar 10% no salario em caso de bonificação.
		return super.getBonificacao() + 100; // super é utilizado no lugar do this pois o atributo salario é da classe mãe
	}
}


