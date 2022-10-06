package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVideo;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(222, 3333);
		cc.deposita(100);
		
		SeguroDeVideo seguro = new SeguroDeVideo();
		
		CalculadorDeImposto cal = new CalculadorDeImposto();
		
		cal.registrar(cc);
		cal.registrar(seguro);
		
		System.out.println(cal.getTotalImposto());

	}

}
