package act50;

import java.util.Scanner;

public class act50 {

	static String nombre;
	static Scanner scanner = new Scanner (System.in);
	public static void nombres() {
		
		System.out.println("ingrese su nombre: ");
		nombre = scanner.next();
	}
	public static void mostrarNombres() {
		
		System.out.println("Su nombre es:"+ nombre);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		nombres();
		mostrarNombres();
		nombres();
		mostrarNombres();
		nombres();
		mostrarNombres();
	}

	
}

