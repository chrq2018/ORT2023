package tp1_act2_ej13;

import java.util.Scanner;

public class TP1_Ej13 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1, num2, num3, mayor;
		boolean sonIguales, num1EsMayor, num2EsMayor;
		
		System.out.println("Ingrese un numero entero");
		num1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero");
		num2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese un numero entero");
		num3 = Integer.parseInt(input.nextLine());
		
		num1EsMayor = ((num1 > num2) && (num1 > num3));
		num2EsMayor = (num2 > num3);
		sonIguales = ((num1 == num2) && (num2 == num3));
		
		if (sonIguales) {
			System.out.println("Los 3 numeros son iguales");
		}
		else 
		{	
			if(num1EsMayor) {
				mayor= num1;
			} else if(num2EsMayor){
				mayor = num2;
			} else {
				mayor = num3;
			}
			
			System.out.println("El mayor es " + mayor);
		} 
				
		input.close();
	}
}
