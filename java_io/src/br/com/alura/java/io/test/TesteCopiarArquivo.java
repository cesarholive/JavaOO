package br.com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException {
		//Fluxo de entrada com arquivo.		
		FileInputStream fis = new FileInputStream("lorem.txt");
		InputStreamReader isr = new InputStreamReader(fis); //transformando bytes em caracteres
		BufferedReader br = new BufferedReader(isr); //para ler uma linha 
		
		OutputStream fos = new FileOutputStream("lorem2.txt");
		Writer osw = new OutputStreamWriter(fos); // transformando bytes em caracteres
		BufferedWriter bw = new BufferedWriter(osw); // para ler uma linha

		
		String linha = br.readLine();
		
		while(linha != null) {
			bw.write(linha);	
			bw.newLine();
			linha = br.readLine();
		}
			
		br.close();
		bw.close();
		
	}

}
