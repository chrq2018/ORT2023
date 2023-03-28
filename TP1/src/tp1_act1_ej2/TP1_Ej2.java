package tp1_act1_ej2;

import java.util.Scanner;

public class TP1_Ej2 {

	private static Scanner input = new Scanner(System.in);
	public static final int CANTIDAD_NOTAS = 3;
	public static void main(String[] args) {
		
		double notaTrimestre1;
		double notaTrimestre2;
		double notaTrimestre3;
		double notaPromedio;

		System.out.println("Ingrese la nota del trimestre 1");
		notaTrimestre1 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese la nota del trimestre 2");
		notaTrimestre2 = Double.parseDouble(input.nextLine());
		
		System.out.println("Ingrese la nota del trimestre 3");
		notaTrimestre3 = Double.parseDouble(input.nextLine());
		
		notaPromedio = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3)/CANTIDAD_NOTAS;
		
		System.out.println("La nota promedio es " + notaPromedio);
		
		input.close();
	}
}
