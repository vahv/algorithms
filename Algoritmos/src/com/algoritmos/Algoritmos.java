package com.algoritmos;

import java.util.Random;
import java.util.Scanner;

public class Algoritmos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Ciclos ciclo = new Ciclos();
		/*
		int base = 0;
		int exponente = 0;
		
		System.out.println("Dame la base");
		base = sc.nextInt();
		System.out.println("Dame el exponente");
		exponente = sc.nextInt();
		System.out.println("Resultado: "+ciclo.potencia(base, exponente));
		 */
		Condicionales condicional = new Condicionales();
		/*
		int calificacion = 0;
		int asistencia = 0;
		System.out.println("Dame la asistencias");
		asistencia = sc.nextInt();
		System.out.println("Dame la calificacion");
		calificacion = sc.nextInt();
		System.out.println("Resultado: "+condicional.acreditacion(asistencia, calificacion));
		*/
		/*
		int horasTrabajadas = 0;
		double horaSueldo = 0;
		System.out.println("Dame las horas trabajadas");
		horasTrabajadas = sc.nextInt();
		System.out.println("Dame el sueldo por hora");
		horaSueldo = sc.nextDouble();
		System.out.println("Sueldo:"+ condicional.calcularSalario(horasTrabajadas, horaSueldo));		
		*/
//		int n1,n2 = 0;
//		System.out.println("Ingresa numero 1");
//		n1 = sc.nextInt();
//		System.out.println("Ingresa numero 2");
//		n2 = sc.nextInt();
//		System.out.println("Cifras totales:"+ciclo.cifrasDosNumeros(n1, n2));
		
//		int horas,minutos,segundos,segundosASumar = 0;
//		System.out.println("Ingresa las horas");
//		horas = sc.nextInt();
//		System.out.println("Ingresa los minutos");
//		minutos = sc.nextInt();
//		System.out.println("Ingresa los segundos");
//		segundos = sc.nextInt();
//		System.out.println("Ingresa el incremento");
//		segundosASumar = sc.nextInt();
//		System.out.println(condicional.sumarSegundos(horas, minutos, segundos, segundosASumar));
		
//		int n = 0;
//		System.out.println("Ingresa numero a invertir");
//		n = sc.nextInt();
//		System.out.println(ciclo.invertirNumero(n));
		
//		int n1,n2,n3 = 0;
//		System.out.println("Dame un numero");
//		n1 = sc.nextInt();
//		System.out.println("Dame un numero");
//		n2 = sc.nextInt();
//		System.out.println("Dame un numero");
//		n3 = sc.nextInt();
//		System.out.println("Minimo comun multiplo de: "+n1+", "+n2+" y "+n3+": "+ciclo.minimoComunMultiplo(n1, n2, n3));

//		Random rnd = new Random(System.nanoTime());
//		int secretNumber = rnd.nextInt(10);
//		int guessingNumber = 0;
//		
//		do {
//			System.out.println("Dame un numero del 1 al 10");
//			guessingNumber = sc.nextInt();
//			System.out.println(condicional.adivinarNumero(secretNumber,guessingNumber));
//		}while(guessingNumber != secretNumber);
		
		int size = 0;
		System.out.println("Ingresa el tamanio del cuadrado");
		size = sc.nextInt();
		ciclo.drawSquare(size);
	}
	

}
