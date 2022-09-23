public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//Vamos escrever o primeiro método. que são os metodos de fazer as coisas a ação da conta. como depositar e sacar.
	//void é oque ele devolve para você e double valor é o que ele recebe. no caso receber o valor para deposito
	public void deposita(double valor) {
		this.saldo += valor;
	}
	//metodo com retorno booleano
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	//metodo para transferir
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}else {
			return false;
		}
	}
}
