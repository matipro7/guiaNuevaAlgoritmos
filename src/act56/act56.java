package act56;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class act56 {
	
	static Scanner scanner = new Scanner (System.in);
	
	static String apellido;
	
	static String nombre;
	
	public static void ingreso() {
		
		System.out.println("Ingrese su nombre: ");
		nombre = scanner.next();
		
		System.out.println("Ingrese su apellido: ");
		apellido = scanner.next();
		
		
	}
	
	public static void mostrar() {
		
		System.out.println("el nombre es " +nombre.toLowerCase() + " y la cantidad de caracteres = "+ nombre.length());
		System.out.println("el apellido es "+apellido.toUpperCase() + " y la cantidad de caracteres = "+ apellido.length());
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		ingreso();
		mostrar();
	}
}
