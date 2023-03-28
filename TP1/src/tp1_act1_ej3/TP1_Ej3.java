package tp1_act1_ej3;

import java.util.Scanner;

public class TP1_Ej3 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		double numero, multiplicadoPor5, divididoPor2;
		
		System.out.println("Ingrese un numero");
		numero = Double.parseDouble(input.nextLine());
		
		multiplicadoPor5 = numero * 5;
		divididoPor2 = numero / 2;
		
		System.out.println("El resultado de multiplicar el numero por 5 es " + multiplicadoPor5 );
		System.out.println("El resultado de dividir el numero por 2 es " + divididoPor2);
		
		input.close();
	}
}
