package tp1_act1_ej7;

import java.util.Scanner;

public class TP1_Ej7 {
	
	private static Scanner input = new Scanner(System.in);
	public static final int CANT_ALTURAS = 3;

	public static void main(String[] args) {

		double ancho, largo, valorMetroCuadradoTierra, valorTotalTerreno, cantMetrosAlambre; 
		
		System.out.println("Ingresar ancho");
		ancho = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingresar largo");
		largo = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingresar el valor del metro cuadrado de tierra");
		valorMetroCuadradoTierra = Double.parseDouble(input.nextLine());
		
		valorTotalTerreno = ancho * largo * valorMetroCuadradoTierra;
		cantMetrosAlambre = 2 * (ancho  + largo) * CANT_ALTURAS;
		
		System.out.println("El valor total del terreno es $" + valorTotalTerreno);
		System.out.println("La cantidad de alambre para cercarlo completamente a " + CANT_ALTURAS + " alturas distintas es " + cantMetrosAlambre  + " metros");

		input.close();
	}
}
