package tp1_act2_ej11;

import java.util.Scanner;

public class TP1_Ej11 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero;
		double resto;
		boolean esPar;
		
		System.out.println("Ingrese un numero entero");
		numero = Integer.parseInt(input.nextLine());
		
		resto = (numero % 2);
		esPar = (resto == 0);
		
		if(esPar) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
		
		input.close();
	}
}
