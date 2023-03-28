package tp1_act2_ej19;

import java.util.Scanner;

public class TP1_Ej19 {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num;
		
		boolean esDeUnSoloDigito, esImpar, estaEnAmbosGrupos, noEstaEnNingunGrupo;
		
		System.out.println("Ingresar numero");
		num = Integer.parseInt(input.nextLine());
		
		double resto = num % 2;
		esDeUnSoloDigito = (num >= -9 && num <= 9);
		esImpar = (resto != 0);
		estaEnAmbosGrupos = (esDeUnSoloDigito && esImpar);
		noEstaEnNingunGrupo = !(esDeUnSoloDigito || esImpar);
		
		System.out.print("Es numero ingresado es: " + num);
		System.out.println();
		System.out.println("Es de un solo digito = " + esDeUnSoloDigito);
		System.out.println("Es impar = " + esImpar);
		System.out.println("Esta en ambos grupos = " + estaEnAmbosGrupos);
		System.out.println("No esta en ningun grupo = " + noEstaEnNingunGrupo);
		
		input.close();
	}

}
