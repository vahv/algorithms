package com.algoritmos;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Algoritmos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Ciclos ciclo = new Ciclos();
		Arreglos arreglo = new Arreglos();
		Archivos archivo = new Archivos();
		/* array de tamaño 10 con numeros aleaorios
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
		
//		int size = 0;
//		System.out.println("Ingresa el tamanio del cuadrado");
//		size = sc.nextInt();
//		ciclo.drawSquare(size);
//		int[] numbers = arreglo.generarLista();
//		String[] months = arreglo.converToMonths(numbers);
//		
//		for(int i = 0;i<12;i++)
//			System.out.print(numbers[i]+" ");
//		
//		System.out.println("");
//		
//		for(int i = 0;i<12;i++)
//			System.out.print(months[i]+" ");
		
//		ArrayList<Integer> fibbonacci = new ArrayList<Integer>();
//		Integer fibboN = 0;
//		System.out.println("Give me fibbo n");
//		fibbonacci = arreglo.fibonacci(sc.nextInt());
//		Iterator iterator = fibbonacci.iterator();
//		while(iterator.hasNext())
//			System.out.print(iterator.next()+" ");
		
//		Stack pila = new Stack();
//		pila.push(1);
//		pila.push(2);
//		pila.push(3);
//		pila.push(4);
//		pila.push(5);
//		System.out.println("Ver ultimo elemento con peek: "+pila.peek());
//		System.out.println("Extraer ultimo elemento con pop: "+pila.pop());
//		System.out.println("Ver ultimo elemento con peek: "+pila.peek());
//		System.out.println("Agregar un elemento con push: pila.push(6)");
//		pila.push(6);
//		System.out.println("Ver ultimo elemento con peek: "+pila.peek());
		
//		PriorityQueue<String> queue = new PriorityQueue<String>();
//		queue.add("zoo");
//		queue.add("Abe");
//		queue.add("master");
//		queue.add("Regi");
//		Iterator iteratos = queue.iterator();
//		
//		while(iteratos.hasNext())
//			System.out.print(iteratos.next()+" ");
//		System.out.println("\nRevisar el primer elemento: "+queue.peek());
//		System.out.println("Extraer el primer elemento: "+queue.poll());
//		System.out.println("Cola contiene Abe? "+queue.contains("Abe"));
//		System.out.println("Cola contiene Abe? "+queue.contains("zoo"));
//		System.out.println("Remover zoo: "+queue.remove("zoo"));
		
//		TreeSet<String> tree = new TreeSet<String>();
//		tree.add("Red");
//		tree.add("Chrome");
//		tree.add("Purple");
//		tree.add("White");
//		tree.add("Orange");
//		Iterator iterator = tree.iterator();
//		while(iterator.hasNext())
//			System.out.print(iterator.next()+" ");
//		System.out.println("\nSe agergo Red: "+tree.add("Red"));
//		System.out.println("Se agrego Pink: "+tree.add("Pink"));
//		System.out.println("Se removio Chrome: "+tree.remove("Chrome"));
//		iterator = tree.iterator();
//		while(iterator.hasNext())
//			System.out.print(iterator.next()+" ");
		
//		Hashtable<Integer,String> hash = new Hashtable<Integer,String>();
//		hash.put(1, "Red");
//		hash.put(2, "Violet");
//		hash.put(3, "Aquamerine");
//		Enumeration<Integer> en = hash.keys();
//		while(en.hasMoreElements()) {
//			Integer key = (Integer) en.nextElement();
//			System.out.println("Clave:"+key+" Element:"+hash.get(key));
//		}
//		System.out.println("Se agrego 3:Red? "+hash.put(3, "Red"));
//		System.out.println("Se agrego 5:Red? "+hash.put(3, "Red"));
//		System.out.println("Contiene elemento con llave 5? "+hash.containsKey(5));
//		System.out.println("Elemento con llave 3:"+hash.get(3));
	
//		TreeMap<String, Integer> treeMap = new TreeMap<String,Integer>();
//		treeMap.put("Blue", 1);
//		treeMap.put("Purple", 2);
//		Iterator iterator = treeMap.keySet().iterator();
//		while(iterator.hasNext()) {
//			String key = (String) iterator.next();
//			System.out.println(key+":"+treeMap.get(key));
//		}
		
//		int[] array = {0,1,2,3,4,5,6,7,8,9};
//		int[] result = arreglo.recorrerIndex(array);
//		for(int element : result)
//			System.out.print(element+" ");
//		
//		String directory = "C:\\read.txt";
//		String text = archivo.readFile(directory);
//		System.out.println(text);
		
//		String directory = "C:\\Users\\VictorAbel\\Desktop\\write.txt";
//		String contenido = "Y la chona se mueve, y la gente le grita\r\n" + 
//				"No hay mejor que la chona, para la quebradita\r\n" + 
//				"Y la chona se mueve, al ritmo que le toquen\r\n" + 
//				"Ella baila de todo, nunca pierde su trote\r\n" + 
//				"\"Y gozamelo digamos\"\r\n" + 
//				"Contare la historia de una famosa persona\r\n" + 
//				"Todos la conocen con el apodo de chona\r\n" + 
//				"Todos la conocen con el apodo de chona";
//		archivo.escribir(directory, contenido);
//		System.out.println(archivo.readFile(directory));
		
		String directory = "C:\\Users\\VictorAbel\\Desktop\\write.txt";
		String text = archivo.readFile(directory);
		String contenido = archivo.replaceVowels(text);
		archivo.escribir(directory, contenido);
		
		
	}
	
}
