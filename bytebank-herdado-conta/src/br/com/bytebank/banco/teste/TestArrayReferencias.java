package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TestArrayReferencias {
	public static void main(String[] args) {

		// int [] idades = new [5];
		ContaCorrente[] contas = new ContaCorrente[5];

		ContaCorrente cc1 = new ContaCorrente(22, 33);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(23, 311);
		contas[1] = cc2;
		try {
		System.out.println(contas[2].getAgencia());
		}finally {
			System.out.println("Valor Nulo");
		}
	}
}
