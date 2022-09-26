
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2406);
		
		//neste momento a conta vale 0 que é incorreto.
		

		System.out.println("o valor da agencia" + conta.getAgencia());
		
		Conta conta2 = new Conta(1331, 246);
		System.out.println("o valor da agencia" + conta.getAgencia());
	}
}
