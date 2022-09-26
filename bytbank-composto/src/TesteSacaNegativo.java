
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
		/*System.out.println(conta.saldo); esta chamada n funciona pois o atributo do saldo é privado agora. assim só é
		 * possivel chamar o mesmo via metodos       */
		System.out.println(conta.getSaldo(/* aqui deveria ter o retorno. como não retorna nada fica eem branco*/));
		
	}
}
