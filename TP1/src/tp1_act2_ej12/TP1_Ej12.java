package tp1_act2_ej12;

import java.util.Scanner;

public class TP1_Ej12 {

private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1, num2, mayor;
		
		System.out.println("Ingrese un numero entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero");
		num2 = Integer.parseInt(input.nextLine());
		
		if (num1 == num2) {
			System.out.println("Los numeros son iguales");	
		} else {
			if(num1 > num2) {
				mayor = num1;
			} else {
				mayor = num2;
			}
			System.out.println("El mayor es " + mayor);
		}
		
		input.close();
	}
}