package act44;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class act44 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> fulbo = new ArrayList<>();
        boolean fulbacho = true;

        

        while (fulbacho) {
        	System.out.println("Ingresa equipos de fútbol (escribe 'fin' para terminar):");
            String furbo = scanner.nextLine();

            if (furbo.equals("fin")) {
                fulbacho = false;
            } else {
                fulbo.add(furbo);
            }
        }

        HashSet<String> fulbito = new HashSet<>(fulbo);

        System.out.println("Equipos ingresados:");
        for (String equipo : fulbito) {
            System.out.println(equipo);
        }
    }
}
