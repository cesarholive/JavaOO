package br.com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com arquivo.
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos); // transformando bytes em caracteres
		BufferedWriter bw = new BufferedWriter(osw); // para ler uma linha

		bw.write("Teste nova linha");
		bw.newLine();
		bw.newLine();
		bw.write("Teste linha final");
		
		bw.close();
	}

}
