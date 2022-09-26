public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de conta é: " + total);
		this.agencia = agencia;
		this.numero = numero;
	}

	// Vamos escrever o primeiro método. que são os metodos de fazer as coisas a
	// ação da conta. como depositar e sacar.
	// void é oque ele devolve para você e double valor é o que ele recebe. no caso
	// receber o valor para deposito
	public void deposita(double valor) {
		this.saldo += valor;
	}

	// metodo com retorno booleano
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	// metodo para transferir
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	// pego saldo, pois o mesmo é private agora
	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <=0) {
			System.out.println("Não pode numero menor ou igual a 0.");
		}
		this.numero = numero; // numero da direita é uma varial local pois o numero da esquerda é o
								// this.numero
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode numero negativo");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}
}
