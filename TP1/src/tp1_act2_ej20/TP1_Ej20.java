package tp1_act2_ej20;

import java.util.Scanner;

public class TP1_Ej20 {

	private static Scanner input = new Scanner(System.in);
	public static final char SUMA = '+';
	public static final char RESTA = '-';
	public static final char MULTIPLICAR = '*';
	public static final char DIVIDIR = '/';
	
	public static void main(String[] args) {
		
		int num1, num2, suma, resta, multiplicar;
		double dividir; 
		char operacion;
		
		System.out.println("Ingrese un numero entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingresar operacion (+ , - , * , /)");
		operacion = input.nextLine().charAt(0);
		
		switch (operacion) {
			case SUMA: 
				suma = num1 + num2;
				System.out.println("La suma es " + suma);
				break;

			case RESTA: 
				resta = num1 - num2;
				System.out.println("La resta es " + resta);
				break;

			case MULTIPLICAR: 
				multiplicar = num1 * num2;
				System.out.println("La multiplicacion es " + multiplicar);
				break;
				
			case DIVIDIR: 
				if (num2 != 0) {
					dividir = (double)num1 / num2;
					System.out.println("La division es " + dividir);
					break;
				} else {
					System.out.println("ERROR, no se puede dividir por cero");
				}
				break;

			default:
				System.out.println("ERROR, no ingresó un operador valido");
		}
		
		input.close();
	}
}
