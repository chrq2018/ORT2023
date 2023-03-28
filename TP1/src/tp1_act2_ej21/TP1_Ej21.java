package tp1_act2_ej21;

import java.util.Scanner;

public class TP1_Ej21 {
	
	private static Scanner input = new Scanner(System.in);
	public static final int DOMINGO = 1;
	public static final int LUNES = 2;
	public static final int MARTES = 3;
	public static final int MIERCOLES = 4;
	public static final int JUEVES = 5;
	public static final int VIERNES = 6;
	public static final int SABADO = 7;
	
	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Ingrese un numero entero (entre 1 y 7)");
		num = Integer.parseInt(input.nextLine());
		
		switch (num) {
			case DOMINGO: 
				System.out.println("DOMINGO");
				break;
		
			case LUNES: 
				System.out.println("LUNES");
				break;
		
			case MARTES: 
				System.out.println("MARTES");
				break;
		
			case MIERCOLES: 
				System.out.println("MIERCOLES");
				break;	
		
			case JUEVES: 
				System.out.println("JUEVES");
				break;
		
			case VIERNES: 
				System.out.println("VIERNES");
				break;
		
			case SABADO: 
				System.out.println("SABADO");
				break;
		
			default:
				System.out.println("ERROR, ingresó un numero fuera de rango");
		}
		
		input.close();
	}
}
