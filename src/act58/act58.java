package act58;

import java.util.Scanner;

public class act58 {

	static String nombre;
	
	static Scanner scanner = new Scanner (System.in);
	
	static String apellido;
	
	public static void ingreso() {
		
		System.out.println("Ingrese el nombre: ");
		nombre= scanner.next();
		
		System.out.println("Ingrese el apellido: ");
		apellido= scanner.next();
		
	}
		
	public static void muestra() {
		
		String nombremin = nombre.toLowerCase();
		String apellidomin = apellido.toLowerCase();
		char nombreprinc = nombremin.toUpperCase().charAt(0);
		char apellidoprinc = apellidomin.toUpperCase().charAt(0);
		String nombrefin = nombremin.substring(1);
		String apellidofin = apellidomin.substring(1);
		
		System.out.println(nombreprinc + nombrefin);
		System.out.println(apellidoprinc + apellidofin);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ingreso();
		muestra();
	}

}
