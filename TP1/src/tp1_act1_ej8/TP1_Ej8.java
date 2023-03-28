package tp1_act1_ej8;

import java.util.Scanner;

public class TP1_Ej8 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, suma, resta, multiplicacion; 
		double division;
		
		System.out.println("Ingrese un numero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un numero");
		num2 = Integer.parseInt(input.nextLine());
		
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;
		division = (double)num1 / num2;
		
		System.out.println("La suma es " + suma);
		System.out.println("La resta es " + resta);
		System.out.println("La multiplicacion es " + multiplicacion);
		System.out.println("La division es " + division);
		
		input.close();
	}
}
