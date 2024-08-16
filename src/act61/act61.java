package act61;

import java.util.InputMismatchException;
import java.util.Scanner;

public class act61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		float numero,raiz;
		boolean pro = true;
		
		
		
		try {
			System.out.println("Ingrese un numero para sacar su raiz cuadrada: ");
			numero = scanner.nextInt();
			
			raiz =(float) Math.sqrt (numero);
			
			if (numero < 0) {
                throw new ArithmeticException();
			
			}
			else {
				System.out.println("la raiz cuadrada es: " + raiz);
			}
				
			}
		catch(ArithmeticException e) {
			System.out.println("ERROR!!, numero negativo");
		}
		catch(InputMismatchException e) {
				System.out.println("Dato no valido");
				
			}
		
		
			
			
			
		
		 
		
		
		
		
		
		
	}

}
