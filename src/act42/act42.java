package act42;

import java.util.ArrayList;
import java.util.Scanner;

public class act42 {

	static Scanner scanner = new Scanner (System.in);
	
	static ArrayList <Integer> DNI = new ArrayList<>(4);
	
	public static void ingresarDNI() {
		
		
		
		for (int i = 0; i<4; i++) {
			
			System.out.println("ingrese dni " + (i+1) + " : " );
			DNI.add(scanner.nextInt());
		}
		
		}
		
	public static void ordenar() {
		
		 for (int i = 0; i<4-1;i++){
	            for (int j = 0; j<4-i -1; j++) {
	                if (DNI.get(j)> DNI.get(j+1)){
	                    

	                    int temp2 = DNI.get(j);
	                    
	                    DNI.set(j, DNI.get(j+1)); 
	                    
	                    DNI.set(j+1,temp2);
	}
	
	            }
	            }
	}
		 public static void mostrarOrdenado() {
			
		
	for (int mostrarDni: DNI) {
		System.out.println(mostrarDni);
	}
		 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ingresarDNI();
		ordenar();
		mostrarOrdenado();
	}

}