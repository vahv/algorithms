package com.algoritmos;

public class Ciclos {
	
	public int potencia (int base, int exponente) {
		int resultado = 1;
		for(int i = 0; i<exponente;i++) {
			resultado *= base;
		}
		return resultado;
	}
	
	private int cifras (int n) {
		int cifra = 0;
		int aux = n;
			
		do {
			aux = aux/10;
			cifra++;
		} while (aux > 0);
		
		return cifra;
	}
	
	public int cifrasDosNumeros (int n1, int n2) {			
		return cifras(n1) + cifras(n2);
	}
	
	public int invertirNumero (int n) {
		int cifras = cifras(n);
		int invertido = 0;
		int divisorCifras = 1;
		int multiplicadorCifras = 1;
		
		for (int i = 1; i< cifras; i++) {
			divisorCifras *=10;
		}
		
		while (divisorCifras >= 1) {
			invertido += n/divisorCifras * multiplicadorCifras;
			n %= divisorCifras;
			divisorCifras /= 10;
			multiplicadorCifras *= 10;
		}
		return invertido;
	}
	
	public boolean esPrimo(int n) {
		if (n <= 1) return false;
		if (n <= 3) return true;
		if(n % 2 == 0 || n % 3 == 0) 
			return false;
		int i = 5;
		while (i*i <= n) {
			if (n%i==0 || n%(i+2)==0) 
				return false;
			i += 6;
		}
		return true;
	}
	
	public int minimoComunMultiplo(int n1, int n2, int n3) {
		int minComMultiplo = 0;
		int mayor,menor = 0;
		mayor = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
		minComMultiplo = mayor;
		boolean flag = false;
		
		if(minComMultiplo%n1 == 0 && minComMultiplo%n2 == 0 && minComMultiplo%n3 == 0)
			return minComMultiplo;
		
		while (!flag){
			minComMultiplo += mayor;
			
			if(minComMultiplo%n1 == 0 && minComMultiplo%n2 == 0 && minComMultiplo%n3 == 0)
				flag = true;
		}
			
		return minComMultiplo;
	}
	
	public void drawSquare(int size) {
		for(int i = 0; i<size;i++) {
				for(int j = 0; j<size;j++)
					System.out.print("*");
				System.out.println("");
		}
	}
}
