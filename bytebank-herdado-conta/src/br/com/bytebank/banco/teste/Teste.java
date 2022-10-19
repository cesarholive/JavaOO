package br.com.bytebank.banco.teste;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class Teste {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(1, 22);
		
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(1, 221);
		
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(1, 221);
		
		lista.add(cc3);
		
		int tamanho = lista.size();
		System.out.println(tamanho);
		
		Conta ref = lista.get(0);
		
		System.out.println(ref.getNumero());
		
	}

}
