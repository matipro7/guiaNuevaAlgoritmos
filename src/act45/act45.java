package act45;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class act45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);
	       
	List<String> sudaca = new ArrayList<>();
	
		 String paising;
		 
		sudaca.add("Argentina");

		sudaca.add("Bolivia");
		
		sudaca.add("Brasil");
		
		sudaca.add("Chile");
		
		sudaca.add("Colombia");
		
		sudaca.add("Ecuador");
		
		sudaca.add("Guyana");

		sudaca.add("Paraguay");
		
		sudaca.add("Perú");
		
		sudaca.add("Surinam");
		
		sudaca.add("Uruguay");
		
		sudaca.add("Venezuela");
		
		   System.out.println("Ingrese un pais sudamericano: ");
		   
		  paising = scanner.next();
		
		if(sudaca.contains(paising)) {
			
			System.out.println("Este pais es Sudamericano");
		}
			else {
				System.out.println("El pais no esta en sudamerica");
			
		}   
	
		Collections.sort(sudaca);
		
		for (String sudaca2 : sudaca) {
			   
			   System.out.println(sudaca2);
		
	
}
}
}