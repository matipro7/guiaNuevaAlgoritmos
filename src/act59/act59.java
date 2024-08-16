package act59;
import java.util.Scanner;
import java.util.InputMismatchException;
public class act59 {

	static Scanner scanner = new Scanner (System.in);
	static int edad;
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		try {
			System.out.println("ingrese la edad: ");
			edad = scanner.nextInt();
		
			if (edad < 0) {
                throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e) {
			System.out.println("edad invalidada");
		}
}
}