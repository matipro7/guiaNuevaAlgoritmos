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
                System.out.println("N�mero ingresado: " + numero);
            } catch (InputMismatchException e) {
                System.out.println("Dato no v�lido. Por favor ingrese un n�mero entero.");
                scanner.next(); 
            }
        }

        scanner.close(); // Cerrar el scanner
    }
}
