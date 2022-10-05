
public class Fluxo {
	int i = 3;

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String ms = ex.getMessage();
			System.out.println("ArithmeticException " + ms);
			ex.printStackTrace();
		} 
		
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		
		throw new MinhaExcecao("Deu errado");
		
		
		//System.out.println("Fim do metodo2");
	}
}