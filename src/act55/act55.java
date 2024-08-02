package act55;

import java.util.ArrayList;
import java.util.Scanner;

public class act55 {

	static Scanner scanner = new Scanner (System.in);
	
	static ArrayList <String> apellidos = new ArrayList<>(4);
	
	public static void ingresarDNI() {
		
		
		
		for (int i = 0; i<4; i++) {
			
			System.out.println("apellido " + (i+1) + " : " );
			apellidos.get(i);
		}
		
		}
		
	public static void ordenar() {
		
		 for (int i = 0; i<4-1;i++){
	            for (int j = 0; j<4-i -1; j++) {
	                if (apellidos.get(j)> apellidos.get(j+1)){
	                    

	                    String temp2 = apellidos.get(j);
	                    
	                    apellidos.set(j, apellidos.get(j+1)); 
	                    
	                    apellidos.set(j+1,temp2);
	}
	
	            }
	            }
	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
