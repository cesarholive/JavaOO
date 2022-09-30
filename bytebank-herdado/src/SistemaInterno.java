
public class SistemaInterno {

	private int senha = 222;

	public void autentica(Autenticavel g) {
		boolean autenticou = g.autentica(this.senha);
		if (autenticou) {
			System.out.println("Bem vindo ao sistema! ");
		} else {
			System.out.println("Não pode entrar no sistema! ");
		}
	}

}
