package com.algoritmos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Arreglos {

	public int[] generarLista() {
		int[] list = new int [12];
		Random rnd = new Random(System.nanoTime());
		for(int i = 0; i<12;i++) {
			list [i] = rnd.nextInt(12);
		}
		return list;
	}
	
	public String[] converToMonths(int[]l) {
		String[] months = {"None","January","February","March","April","May","June","July","August","September","October","November","December"};
		String[] result = new String[12];
		int monthNumber = 0;
		for(int i = 0; i<12;i++) {
			monthNumber = l[i];
			result[i] = months [monthNumber];
		}
		return result;
	}
	
	public ArrayList<Integer> fibonacci(Integer fiboN) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(fiboN < 2)
			list.add(1);
		else {
			list.add(1);
			list.add(1);
		}
		for(int i = 0; i < fiboN-2;i++)
			list.add(list.get(list.size()-1) + list.get(list.size()-2));
	
		return list;
	}
	
	public int[] recorrerIndex(int[] array) {
		int[] result = new int[array.length];
		for(int i = 0; i<array.length;i++) {
			result[(i + 1) > (array.length - 1)? 0 : i + 1] = array[i];
		}
		return result;
	}
	
}
