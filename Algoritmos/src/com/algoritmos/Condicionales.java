package com.algoritmos;

public class Condicionales {
	public boolean acreditacion (int asistencia, int calificacion) {
		final int totalAsistencias = 70;
		final int minimoAprobatorio = 60;
		final double minimoAsistencias = totalAsistencias * 0.8;
		
		if(calificacion >= minimoAprobatorio && asistencia >= minimoAsistencias)
			return true;
		else 
			return false;
	}
	
	public double calcularSalario(int horasTrabajadas, double horaSueldo) {
		final double horaExtraRate = 1.5;
		final int horasJornadaNormal = 40;
		double paga = 0;
		
		if (horasTrabajadas > horasJornadaNormal) {
			int horasExtra = horasTrabajadas - horasJornadaNormal;
			paga = horasExtra * horaSueldo * horaExtraRate + horasJornadaNormal * horaSueldo;
		}
		else 
			paga = horasTrabajadas * horaSueldo;
		return paga;
	}
	
	public int elDeEnMedio(int n1, int n2, int n3) {
		int mayor,menor,medio = 0;
		
		mayor = (n1 > n2 && n1 > n3) ? n1 : (n2 > n3) ? n2 : n3;
		menor = (n1 < n2 && n1 < n3) ? n1 : (n2 < n3) ? n2 : n3;
		
		medio = (n1 != mayor && n1 != menor) ? n1 : (n2 != mayor && n2 != menor) ? n2 : n3;
		
		return medio;
		
	}
	
	public String sumarSegundos (int horas, int minutos, int segundos, int segundosASumar) {
			segundos += segundosASumar;
			
			if (segundos >= 60) {
				minutos += segundos/60;
				segundos %= 60;
				
				if (minutos >= 60) {
					horas += minutos/60;
					minutos %= 60;
					
					if (horas >= 24) {
						horas %= 24;
					}
				}
			}
		return horas+":"+minutos+":"+segundos;
	}
	public String adivinarNumero(int secretNumber, int guessingNumber) {
		if (guessingNumber == secretNumber)
			return "Adivinaste!";
		else if (guessingNumber > secretNumber)
			return "Es menor";
		else if (guessingNumber < secretNumber)
			return "Es mayor";
		
		else return "Error";
	}
}
