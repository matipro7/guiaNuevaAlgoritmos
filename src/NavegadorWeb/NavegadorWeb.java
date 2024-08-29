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

        // Página inicial
        String paginaActual = "https://www.google.com.ar/?hl=es-419&safe=active&ssui=on";
        historial.add(paginaActual);

        boolean menu = true;
        int opcion;

        while (menu) {

            System.out.println("\n1. Visitar una página nueva.");
            System.out.println("2. Volver atrás.");
            System.out.println("3. Avanzar.");
            System.out.println("4. Mostrar historial.");
            System.out.println("5. Salir.");

            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la URL de la nueva página: ");
                    String nuevaURL = scanner.nextLine();

                    // Agregar la página actual al historial de atrás
                    atras.push(paginaActual);

                    // Limpiar el historial de adelante, ya que la nueva navegación descarta el historial adelante
                    adelante.clear();

                    // Establecer la nueva página actual
                    paginaActual = nuevaURL;
                    historial.add(paginaActual);

                    System.out.println("Página actual: " + paginaActual);
                    System.out.println("Historial de páginas: " + historial);

                    break;

                case 2:
                    if (!atras.isEmpty()) {
                        // Mover la página actual al historial de adelante
                        adelante.push(paginaActual);

                        // Volver a la página anterior
                        paginaActual = atras.pop();
                        historial.add(paginaActual);

                        System.out.println("Página actual: " + paginaActual);
                        System.out.println("Historial de páginas: " + historial);
                    } else {
                        System.out.println("No hay páginas anteriores.");
                    }

                    break;

                case 3:
                    if (!adelante.isEmpty()) {
                        // Mover la página actual al historial de atrás
                        atras.push(paginaActual);

                        // Avanzar a la página siguiente
                        paginaActual = adelante.pop();
                        historial.add(paginaActual);

                        System.out.println("Página actual: " + paginaActual);
                        System.out.println("Historial de páginas: " + historial);
                    } else {
                        System.out.println("No hay páginas adelante.");
                    }

                    break;

                case 4:
                    System.out.println("Historial de páginas: " + historial);
                    break;

                case 5:
                    menu = false;
                    System.out.println("Saliendo del navegador.");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    break;
            }
        }

        scanner.close();
    }
}