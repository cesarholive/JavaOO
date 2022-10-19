package br.com.bytebank.banco.teste.util;
import br.com.bytebank.banco.modelo.Conta;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.ContaCorrente;


public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();
		
		Object cc = new ContaCorrente(1, 22);
		
		lista.add(cc);
		
		Object cc2 = new ContaCorrente(1, 221);
		
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		
		System.out.println(ref.getNumero());
       //teeste
	}

}
