package br.com.bytebank.banco.teste;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteArrayListEqual {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(1, 22);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(1, 221);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(1, 221);
		boolean existe = lista.contains(cc3);
		System.out.println("Já existe?: " + existe);
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		
//		for (Conta conta : lista) {
//			if(conta.ehIgual(cc3)) {
//				System.out.println("Ja tenho esta conta!  ");
//			}
//			System.out.println(conta);
//		}
		
		
	
	
		
	}

}
