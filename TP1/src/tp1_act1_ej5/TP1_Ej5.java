package tp1_act1_ej5;

import java.util.Scanner;

public class TP1_Ej5 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2, auxiliar;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un numero");
		num2 = Integer.parseInt(input.nextLine());
		
		System.out.println("El valor de num1 es " + num1);
		System.out.println("El valor de num2 es " + num2);
		
		System.out.println("Se intercambian los valores");
		
		auxiliar = num1;
		num1 = num2;
		num2 = auxiliar;
		
		System.out.println("El valor de num1 es " + num1);
		System.out.println("El valor de num2 es " + num2);
		
		input.close();
	}
}
