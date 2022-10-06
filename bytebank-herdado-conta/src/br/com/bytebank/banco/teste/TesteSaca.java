package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

	public static void main(String[] args) {
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}
		
		System.out.println(conta.getSaldo());
		
		
		
		String nome = "Mario"; //object literal
	    String outro = new String("Alura"); //má prática, sempre prefira a sintaxe literal

	    String novo1 = outro.replace("A", "a");

	    System.out.println(novo1);
	    
	    
	    
	    String novo = nome.toLowerCase(); //também teste toUpperCase()

	    System.out.println(novo);
	    
	    
	    char c = nome.charAt(3); //char i
	    System.out.println(c);

	    int pos = nome.indexOf("rio");
	    System.out.println(pos);

	    String sub = nome.substring(1);
	    System.out.println(sub);
	    
	    //mostra todas as caracteres linha por linha usando um laço for junto com os métodos length e charAt:
	    for(int i = 0; i < nome.length(); i++) {
	        System.out.println(nome.charAt(i));
	    } 
	    
	}

}


