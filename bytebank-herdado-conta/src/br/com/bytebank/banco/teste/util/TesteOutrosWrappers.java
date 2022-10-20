package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		
		Integer idadeRef = new Integer(29); //autobixubg
		System.out.println(idadeRef.intValue()); //unboxing
		
		Double dRef = new Double(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());
		
		Number refNumber = Double.valueOf(29.9);
		
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(22.9);
		lista.add(2,9f);
	}

}
