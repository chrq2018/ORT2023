package tp1_act2_ej18;

import java.util.Scanner;

public class TP1_Ej18 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		int num1, num2, menor, mayor, resto;
		boolean esMayor, esDivisible;
		
		System.out.println("Ingrese un numero entero");
		num1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese un numero entero");
		num2 = Integer.parseInt(input.nextLine());
		
		esMayor = (num1 > num2);
		
		if (esMayor) {
			mayor = num1;
			menor = num2;
		} else {
			mayor = num2;
			menor = num1;
		}
		
		resto = mayor % menor;
		esDivisible = (resto == 0);
		
		if (esDivisible) {
			System.out.println("El mayor: " + mayor + " es divisible por el menor: " + menor);
		} else {
			System.out.println("El mayor: " + mayor + " no es divisible por el menor: " + menor);
		}
		
		input.close();
	}
}
