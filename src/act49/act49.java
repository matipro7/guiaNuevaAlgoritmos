package act49;

import java.util.Scanner;

public class act49 {
	
	static Scanner scanner = new Scanner (System.in);
	static String apellido;
	static float altura = 1.8f;
	static int edad = 20;
	
	
		public static void ingresarNombre() {
		String nombre;
		System.out.println("ingrese su nombre:");
		nombre = scanner.next();
	
		System.out.println("ingrese su apellido:");
		apellido = scanner.next();
		/*  ¿Lleva parámetros y argumentos esta función?¿Por qué? Definir parámetros y argumentos.
		-No, porque dentro de los parentesis no hay nada. Los parametros son lo que espera la funcion y los argumentos
		son los valores que le damos

	¿Cuál es la variable local, y cuál la global? Mencioná dos diferencias entre variables locales y globales.

	La variable local es "string nombre" y la variable global es "static string apellido". ¿cuales son la 
	diferencia entre estos? muy facil. Una de las diferencias es que la variable local se declara unicamente 
	para ser usado en unafuncion y la global se declara para ser usado en todo el programa y la otra 
	diferencia es que la variablelocal utiliza memoria unicamente cuando se esta invocando la funcion
	 y la global ocupa memoria durante todo el programa         
	*/
}	
		
		
		public static float alturaPersona(float a) {
		
		a = altura;
		
		return a;
	}
		
		public static int filtrarEdad(int edad) {
			if (edad >= 18) {
				return edad;
			}
			else {
				return -1;
			}
		
		}
	
		// FUNCION ANALIZARSITRABAJA
	    public static boolean analizarSiTrabaja (String respuesta) {
	       
	        if (respuesta.equalsIgnoreCase("si")) {
	            return true;
	        } else {
	            return false;
	        }
	       
	       
	    }
	   
	    // FUNCION CANTIDADANIMALES
	    public static void cantidadAnimales(int gatos, int perros) {
	        
	    	
	    	System.out.println("La cantidad de perros es: "+ perros);
	        System.out.println("La cantidad de gatos es: "+ gatos);
		
	    
		
	    }
		
	public static void main(String[] args) {
		
		ingresarNombre();	
		System.out.println(alturaPersona(altura) );
		alturaPersona(altura);
		filtrarEdad(25);
		 System.out.println("Trabaja? "+ analizarSiTrabaja("no") );
	        System.out.println("");
	       
	        cantidadAnimales(5, 7);
	        System.out.println("");
	
	}
	
}
