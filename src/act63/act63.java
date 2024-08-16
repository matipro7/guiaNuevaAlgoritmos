package act63;

import java.util.ArrayList;
import java.util.Scanner;

public class act63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner (System.in);
		String [] apellidos = {"ciroco","fernandez","gutierrez","gonzalez","davalo"};
		int [] nume = {0,1,2,3,4};
		int numero;
			
			System.out.println("ingrese el numero de empleado del 0-4: ");
			numero= scanner.nextInt();
			for(int i =0; i<5;i++) {
			if (numero == nume[i]) {
				
			System.out.println(apellidos[i]);
				
			
			
		}
			}
		
			
			
			
	

	}}
