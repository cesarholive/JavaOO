
public class TestaMetodo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.saldo = 100;
		//invocando um metodo, no caso se usa ( ) conforme o exemplo conta.deposita(50);
		conta.deposita(50);
		
		System.out.println(conta.saldo);
		///////////////////////////////////////
		conta.saca(20);
		System.out.println(conta.saldo);
		//////////////////////////////////////
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(30220, conta)) {
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(contaDaMarcela.saldo);
	}
}
