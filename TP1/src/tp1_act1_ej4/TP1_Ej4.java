package tp1_act1_ej4;

import java.util.Scanner;

public class TP1_Ej4 {
	
	private static Scanner input = new Scanner(System.in);
	public static final int CANT_DIAS_HABILES = 5;
	public static void main(String[] args) {
		
		double valorHoraTrabajo, valorSalarioSemanal, cantHorasTrabajadasPorDia;
		
		System.out.println("Ingrese el valor monetario de una hora de trabajo");
		valorHoraTrabajo = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingresar las horas trabajadas por dia");
		cantHorasTrabajadasPorDia = Double.parseDouble(input.nextLine());
		valorSalarioSemanal = valorHoraTrabajo * (cantHorasTrabajadasPorDia * CANT_DIAS_HABILES + cantHorasTrabajadasPorDia / 2);
		
		System.out.println("El valor del trabajo semanal es " + valorSalarioSemanal);
		input.close();
	}
}
