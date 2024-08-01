package act42;

import java.util.ArrayList;
import java.util.Scanner;

public class act42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numeros = new ArrayList<>();

		numeros.add(1011);
		numeros.add(2367);
		numeros.add(8748);
		numeros.add(9121);
		numeros.add(817);
		numeros.add(6423);
		numeros.add(2034);

		ArrayList<String> nombres = new ArrayList<>();

		nombres.add("Enrique");
		nombres.add("Liliana");
		nombres.add("Lucas");
		nombres.add("Juan");
		nombres.add("Fiorella");
		nombres.add("Ariel");
		nombres.add(" Daiana");

		System.out.println("Para encontrar un individuo ingresar numero de socio: ");
		int numerosocio = scanner.nextInt();

		for (int i = 0; i < 7; i++) {

			if (numerosocio == numeros.get(i)) {
				System.out.println(nombres.get(i) + numeros.get(i));
			}
		}
	}
}
