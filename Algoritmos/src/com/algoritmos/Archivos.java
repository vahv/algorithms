package com.algoritmos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivos {
	public String readFile(String ubicacion) {
		String texto = "";
		try {
			File archivo = new File(ubicacion);
			FileReader fileReader = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fileReader);
			String temp;
			
			while((temp=buffer.readLine())!=null)
				texto += temp+"\r\n";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return texto;
	}
	
	public void escribir (String ubicacion, String contenido) {
		try {
			FileWriter archivo = new FileWriter(ubicacion,true);
			PrintWriter writer = new PrintWriter(archivo);
			writer.println(contenido);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String replaceVowels(String text) {
		String result="";
		char c;
		for(int i = 0; i<text.length();i++) {
			 c = text.charAt(i);
			result += (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?'_' : c;
		}
		
		return result;
	}
}
