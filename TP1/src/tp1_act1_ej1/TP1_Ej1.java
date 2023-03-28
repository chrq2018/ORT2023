package tp1_act1_ej1;

import java.util.Scanner;

public class TP1_Ej1 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String nombre;
		
		System.out.println("Ingresar nombre");
		nombre = input.nextLine();
		
		System.out.println("Bienvenido " + nombre);
		
		input.close();
	}
}
