package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
	public static void main(String[] args) {

		// int [] idades = new [5];
		Object [] referencias = new Object[5];

		ContaCorrente cc1 = new ContaCorrente(22, 33);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(23, 311);
		referencias[1] = cc2;
		
		Cliente cli = new Cliente();
		referencias[2] = cli;
		
//		try {
//		System.out.println(contas[2].getAgencia());
//		}finally {
//			System.out.println("Valor Nulo");
//		}
		
		ContaPoupanca ref = (ContaPoupanca)referencias[1]; // type cast
	}
}
