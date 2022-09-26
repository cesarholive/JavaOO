
public class TestaGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome()); //para imprimir o conteudo d do nome da titular,o java vai primeiro em get titular via referencia,
		//e logo em sguida para Conta onde tem o get nome.
		
		conta.getTitular() .setProfissao("Engenheiro");
		System.out.println(conta.getTitular() .getProfissao());
	}
}
