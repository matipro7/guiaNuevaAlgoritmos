package act46;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class act46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 ArrayList<Integer> legajo = new ArrayList<>();
		 ArrayList<String> nombre = new ArrayList<>();
	     ArrayList<String> apellido = new ArrayList<>();
	     
	     //uso joptionpane para cancherear jeje :)
	     int cant = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de empleados a registrar: "));
	     
	     
	     for (int i = 0; i<cant; i++) {
	    	 System.out.println((i + 1) + "nombre : ");
	    	nombre.add(scanner.next());
	    	
	    	 System.out.println((i + 1) + "apellido : ");
	    	 apellido.add(scanner.next());
	    	 
	    	 System.out.println((i + 1) + "legajo : ");
	    	 int ingresado = scanner.nextInt();
	
	    	 if (ingresado <= 9999 ||ingresado > 99999 ) {
	    		 System.out.println("numero de legajo incorrecto, tiene que contener solo 5 cifras");
	    		 
	    		 System.out.println("ingrese un legajo que contenga solo 5 cifras : ");
		    	 legajo.add(scanner.nextInt());
		    	 
		   
	    	 }
	    	 else {
	    		 legajo.add(ingresado);
	    	 }
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
	     
	     for (int i = 0; i<cant-1;i++){
            for (int j = 0; j<cant-i -1; j++) {
                if (legajo.get(j)> legajo.get(j+1)){
                    int aux = legajo.get(j);
                    
                    legajo.set( j, legajo.get(j+1)); 
                    
                    legajo.set(j+1, aux);  
                    
                    
                    String temp = nombre.get(j);
                    
                    nombre.set( j, nombre.get(j+1)); 
                    
                    nombre.set(j+1,temp);
                    
                
                    String temp2 = apellido.get(j);
                    
                    apellido.set(j, apellido.get(j+1)); 
                    
                    apellido.set(j+1,temp2);
            }
                
                
        
        }
        
            
    }
	 
	     for (int i = 0; i<cant; i++) {
       	 System.out.println("Lista ordenada: " + nombre.get(i) + apellido.get(i) + legajo.get(i) );
       	 
        }

	     System.out.println("ingrese el numero de legajo a buscar: ");
	     int legajito = scanner.nextInt();
	     
	     for (int i = 0; i<cant; i++) {
       	 if (legajito == legajo.get(i)) {
       	 
       	 System.out.println("el legajo coincide y pertenece a: " + nombre.get(i) + apellido.get(i) + legajo.get(i) );
       	 break;
       	 }
       	else if (legajito != legajo.get(i)) {
	    	 System.out.println("no coincide");
	     }
        }
	     
   	 
	
	     System.out.println("programa finalizado");
            	
            	
            
            
            
            
            }
        

    }
