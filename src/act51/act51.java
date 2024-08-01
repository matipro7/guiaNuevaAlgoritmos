package act51;

import java.util.Scanner;

public class act51 {

	static float num;
	static Scanner scanner = new Scanner (System.in);
	
	
	public static void ingresarNumero() {
		
		System.out.println("ingrese un numero: ");
		num = scanner.nextFloat();
	}
	
	
	public static boolean analizarNumero () {
		boolean analisis;
		if (num>0) {
			System.out.println("el numero es positivo");
		return true;
		}
		else {
			System.out.println("el numero es negativo ");
			return false;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ingresarNumero();
		
		System.out.println(analizarNumero());

	}

}
