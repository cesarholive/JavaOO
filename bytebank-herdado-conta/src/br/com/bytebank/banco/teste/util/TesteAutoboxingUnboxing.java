package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteAutoboxingUnboxing {

	public static void main(String[] args) {
		
		int idade = 29; // metodo primitivo //não usar
		
		Integer idadeRef = new Integer(29); //autobixubg
		
		System.out.println(idadeRef.doubleValue());
		
		int valor = idadeRef.intValue(); //unboxing
		
		//String s = new args[0]; //"10"
		
		//Integer numero = Integer.valueOf(s);
		//int numero = Integer.parseInt(s);
		//System.out.println(numero);
		
		
;	
	}

}
