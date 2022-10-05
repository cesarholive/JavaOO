
public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(123, 23132);
		conta.deposita(200.0);
		
		try {
		conta.saca(390.0);
		}catch(SaldoInsuficienteException ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("O saldo é: " + conta.getSaldo() );
	}

}
