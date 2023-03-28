package tp1_act1_ej9;

import java.util.Scanner;

public class TP1_Ej9 {
	
	private static Scanner input = new Scanner(System.in);
	public static final int SUMA_ANGULOS_INTERIORES = 180;
	
	public static void main(String[] args) {
		
		double anguloInterior1, anguloInterior2, anguloInterior3;
		
		System.out.println("Ingresar el valor del primer angulo interior");
		anguloInterior1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingresar el valor del segundo angulo interior");
		anguloInterior2 = Double.parseDouble(input.nextLine());
		
		anguloInterior3 = SUMA_ANGULOS_INTERIORES - (anguloInterior1 + anguloInterior2);
		
		System.out.println("El valor del tercer angulo interior es " + anguloInterior3);
		
		input.close();

	}

}
