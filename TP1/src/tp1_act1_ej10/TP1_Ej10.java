package tp1_act1_ej10;

import java.util.Scanner;

public class TP1_Ej10 {
	
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombreSocio1, nombreSocio2, nombreSocio3;
		double capitalSocio1, capitalSocio2, capitalSocio3, capitalTotalAportado, porcCapSocio1, porcCapSocio2, porcCapSocio3;
		
		System.out.println("Ingresar nombre");
		nombreSocio1 = input.nextLine();
		System.out.println("Ingresar el capital aportado");
		capitalSocio1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingresar nombre");
		nombreSocio2 = input.nextLine();
		System.out.println("Ingresar el capital aportado");
		capitalSocio2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingresar nombre");
		nombreSocio3 = input.nextLine();
		System.out.println("Ingresar el capital aportado");
		capitalSocio3 = Double.parseDouble(input.nextLine());
		
		capitalTotalAportado = capitalSocio1 + capitalSocio2 + capitalSocio3;
		porcCapSocio1 = (capitalSocio1 / capitalTotalAportado) * 100;
		porcCapSocio2 = (capitalSocio2 / capitalTotalAportado) * 100;
		porcCapSocio3 = (capitalSocio3 / capitalTotalAportado) * 100;
		
		System.out.println("El valor total de Capital aportado es $" + capitalTotalAportado);
		System.out.println("El porcentaje de Capital aportado de " + nombreSocio1 + " es " + porcCapSocio1+"%");
		System.out.println("El porcentaje de Capital aportado de " + nombreSocio2 + " es " + porcCapSocio2+"%");
		System.out.println("El porcentaje de Capital aportado de " + nombreSocio3 + " es " + porcCapSocio3+"%");

		input.close();
	}
}
