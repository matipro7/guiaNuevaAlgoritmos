package NavegadorWeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class NavegadorWeb {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> historial = new ArrayList<>();
        Stack<String> atras = new Stack<>();
        Stack<String> adelante = new Stack<>();

        // P�gina inicial
        String paginaActual = "https://www.google.com.ar/?hl=es-419&safe=active&ssui=on";
        historial.add(paginaActual);

        boolean menu = true;
        int opcion;

        while (menu) {

            System.out.println("\n1. Visitar una p�gina nueva.");
            System.out.println("2. Volver atr�s.");
            System.out.println("3. Avanzar.");
            System.out.println("4. Mostrar historial.");
            System.out.println("5. Salir.");

            System.out.print("Elige una opci�n: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la URL de la nueva p�gina: ");
                    String nuevaURL = scanner.nextLine();

                    // Agregar la p�gina actual al historial de atr�s
                    atras.push(paginaActual);

                    // Limpiar el historial de adelante, ya que la nueva navegaci�n descarta el historial adelante
                    adelante.clear();

                    // Establecer la nueva p�gina actual
                    paginaActual = nuevaURL;
                    historial.add(paginaActual);

                    System.out.println("P�gina actual: " + paginaActual);
                    System.out.println("Historial de p�ginas: " + historial);

                    break;

                case 2:
                    if (!atras.isEmpty()) {
                        // Mover la p�gina actual al historial de adelante
                        adelante.push(paginaActual);

                        // Volver a la p�gina anterior
                        paginaActual = atras.pop();
                        historial.add(paginaActual);

                        System.out.println("P�gina actual: " + paginaActual);
                        System.out.println("Historial de p�ginas: " + historial);
                    } else {
                        System.out.println("No hay p�ginas anteriores.");
                    }

                    break;

                case 3:
                    if (!adelante.isEmpty()) {
                        // Mover la p�gina actual al historial de atr�s
                        atras.push(paginaActual);

                        // Avanzar a la p�gina siguiente
                        paginaActual = adelante.pop();
                        historial.add(paginaActual);

                        System.out.println("P�gina actual: " + paginaActual);
                        System.out.println("Historial de p�ginas: " + historial);
                    } else {
                        System.out.println("No hay p�ginas adelante.");
                    }

                    break;

                case 4:
                    System.out.println("Historial de p�ginas: " + historial);
                    break;

                case 5:
                    menu = false;
                    System.out.println("Saliendo del navegador.");
                    break;

                default:
                    System.out.println("Opci�n no v�lida. Por favor, elija una opci�n del men�.");
                    break;
            }
        }

        scanner.close();
    }
}