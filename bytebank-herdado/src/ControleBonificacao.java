
public class ControleBonificacao {
	
	private double soma;

	
	
	public void registra(Funcionario f) { //utilizando referencia generica de Funcionario para pegar os 3 metodos de bonificacao  com apenas 1 metodo.
		double boni = f.getBonificacao();
		this.soma += boni;
	}
	
	
	public double getSoma() {
		return soma;
	}
	
}
