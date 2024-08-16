package act60;

import java.util.Scanner;
import java.util.InputMismatchException;

public class act60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean pro = true;

        while (pro) {
            try {
                System.out.println("Ingrese un numero entero por favor: ");
                numero = scanner.nextInt();
                pro = false; 
                System.out.println("Número ingresado: " + numero);
            } catch (InputMismatchException e) {
                System.out.println("Dato no válido. Por favor ingrese un número entero.");
                scanner.next(); 
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}
