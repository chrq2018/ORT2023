package tp1_act2_ej16;

import java.util.Scanner;

public class TP1Ej16 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int cantInscriptos, cantAsientosDisponibles, cantAsientosQueFaltan;
		boolean alcanzanLosAsientos;
		
		System.out.println("Ingresar cantidad de inscriptos");
		cantInscriptos = Integer.parseInt(input.nextLine());
		System.out.println("Ingresar cantidad de asientos disponibles");
		cantAsientosDisponibles  = Integer.parseInt(input.nextLine());
		
		alcanzanLosAsientos = (cantAsientosDisponibles >= cantInscriptos);
		if (alcanzanLosAsientos) {
			System.out.println("Los asientos alcanzan");
		} else {
			cantAsientosQueFaltan = cantInscriptos - cantAsientosDisponibles; 
			System.out.println("Faltan " + cantAsientosQueFaltan + " asientos");
		}
		
		input.close();
	}
}
