package tp1_act2_ej17;

import java.util.Scanner;

public class TP1_Ej17 {

	private static Scanner input = new Scanner(System.in);
	public static final int EDAD_JUB_HOMBRE = 65;
	public static final int EDAD_JUB_MUJER = 60;
	public static final int EDAD_MIN = 1;
	public static final int EDAD_MAX = 120;
	public static final char HOMBRE = 'M';
	public static final char MUJER = 'F';
	
	public static void main(String[] args) {
		
		int edad;
		char genero;
		boolean jubValidaHombre, jubValidaMujer, ingresoValido;
		
		System.out.println("Ingresar edad");
		edad = Integer.parseInt(input.nextLine());
		System.out.println("Ingresar genero");
		genero = input.nextLine().toUpperCase().charAt(0);
		
		ingresoValido = ((edad >= EDAD_MIN && edad <= EDAD_MAX) && (genero == MUJER || genero == HOMBRE));
		jubValidaHombre = (edad >= EDAD_JUB_HOMBRE);
		jubValidaMujer = (edad >= EDAD_JUB_MUJER && genero == MUJER);
		if (ingresoValido) {
			
			if (jubValidaHombre) {
				System.out.println("Esta en edad de jubilarse");
			} else if(jubValidaMujer){
					System.out.println("Esta en edad de jubilarse");
			} else {
					System.out.println("No esta en edad de jubilarse");
			}
			
		} else {
			System.out.println("Edad fuera de rango o genero inválido");
		}
		
		input.close();
	}
}

