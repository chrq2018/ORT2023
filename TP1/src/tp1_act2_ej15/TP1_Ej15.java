package tp1_act2_ej15;

import java.util.Scanner;

public class TP1_Ej15 {

	private static Scanner input = new Scanner(System.in);
	public static final double ALTURA_MINIMA = 1.5;
	public static final double EDAD_MINIMA = 6;
	public static void main(String[] args) {
		
		String nombre;
		int edad;
		double altura;
		boolean ingresoValido;
		
		System.out.println("Ingresar nombre");
		nombre = input.nextLine();
		System.out.println("Ingresar edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingresar altura");
		altura = Double.parseDouble(input.nextLine());
		
		ingresoValido = (edad > EDAD_MINIMA) || (altura > ALTURA_MINIMA); 
		
		if (ingresoValido) {
			System.out.println(nombre + " puede ingresar");
		} else {
			System.out.println(nombre + " no puede ingresar");
		}
		
		input.close();
	}
}
