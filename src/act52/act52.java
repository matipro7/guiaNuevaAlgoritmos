package act52;

import java.util.Scanner;

public class act52 {
	
	static Scanner scanner = new Scanner(System.in);
	static int costo, descuento;

	public static int ingresarCosto() {

		System.out.println("ingrese el costo: ");
		int costo = scanner.nextInt();
		return costo;

	}

	public static float descuento(int costo) {
		descuento = ((int) (costo * 0.10));
		float gastota = costo - descuento;

		if (costo > 15000) {

			System.out.println("El costo total de la compra es: " + gastota);
			System.out.println("Se le ha descontado: " + descuento);
			return gastota;
		} else {

			System.out.println("El costo total es: ");
			return costo;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(descuento(28000));
		System.out.println(descuento(11000));
		System.out.println(descuento(ingresarCosto()));
	}

}
