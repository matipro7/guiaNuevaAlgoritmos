package NavegadorWeb;

import java.util.Scanner;
import java.util.Stack;

public class NavegadorWeb {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Stack<String> historial = new Stack<>();
		Stack<String> adelante = new Stack<>();

		historial.push("https://www.google.com.ar/?hl=es-419&safe=active&ssui=on");

		boolean menu = true;
		String opcion;
		String URL = "0";

		while (menu) {

			System.out.println("1. Visitar una página nueva.");
			System.out.println("2. Volver atrás.");
			System.out.println("3. Avanzar.");
			System.out.println("4. Mostrar historial.");
			System.out.println("5. Salir.");

			System.out.println("Elige una opcion: ");

			opcion = scanner.next();
			adelante.push(opcion);
			
			
			
			
//			switch (opcion) {
//			
//			case 1 : 
			if (opcion == "1") {

				System.out.println("Ingrese la URL de la nueva pagina: ");
				URL = scanner.next();
				
				System.out.println(historial);
				
				historial.pop();
				historial.push(URL);
			}

			if (opcion == "2") {

				adelante.push("https://www.google.com.ar/?hl=es-419&safe=active&ssui=on");

				historial.pop();
				
//				historial.push(scanner.next());
				
				System.out.println(adelante);
				

			}

//			}
		}
	}
}
