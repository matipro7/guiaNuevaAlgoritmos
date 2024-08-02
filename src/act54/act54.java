package act54;

import java.util.ArrayList;
import java.util.Scanner;

public class act54 {
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Integer> numeros = new ArrayList<>();
	static ArrayList<String> nombres = new ArrayList<>();
	static int numerosocio;
	public static void cargarNumerosYsocios() {
		
		numeros.add(1011);
		numeros.add(2367);
		numeros.add(8748);
		numeros.add(9121);
		numeros.add(817);
		numeros.add(6423);
		numeros.add(2034);
		
		nombres.add("Enrique");
		nombres.add("Liliana");
		nombres.add("Lucas");
		nombres.add("Juan");
		nombres.add("Fiorella");
		nombres.add("Ariel");
		nombres.add(" Daiana");
		
	} 
	
	public static void ingresarSocio() {
		System.out.println("Para encontrar un individuo ingresar numero de socio: ");
		numerosocio = scanner.nextInt();
	}
	
	public static void analizarSocio() {
		
		for (int i = 0; i < 7; i++) {

			if (numerosocio == numeros.get(i)) {
				System.out.println(nombres.get(i) + numeros.get(i));
			}
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cargarNumerosYsocios();
		ingresarSocio();
		analizarSocio();
	}

}
