package tp1_act1_ej6;

import java.util.Scanner;

public class TP1_Ej6 {
	
	static Scanner input = new Scanner(System.in);
	
	public static final double PORCENTAJE_MONTO_TOTAL_VENDIDO = 0.16;
	public static final double SUELDO_FIJO = 44000;
	
	public static void main(String[] args) {
		
		double montoTotalVentas, importeACobrarVendedor; 
		
		System.out.println("Ingrese el monto total de las ventas realizadas por un vendedor durante el mes");
		montoTotalVentas = Double.parseDouble(input.nextLine());
		
		importeACobrarVendedor = SUELDO_FIJO + (montoTotalVentas * PORCENTAJE_MONTO_TOTAL_VENDIDO);
		System.out.println(" El importe a cobrar por el vendedor es $" + importeACobrarVendedor);
		
		input.close();
	}

}
