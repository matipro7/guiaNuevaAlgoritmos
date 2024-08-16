package act57;

import java.util.Scanner;

public class act57 {
    static Scanner scanner = new Scanner(System.in);
    static String correo;
    static String contrasena;
    static boolean validarCorreo = false, validarContrasena = false;
    public static void ingresarCorreo() {
        

        while (!validarCorreo) {
            System.out.println("Ingresar correo: ");
            correo = scanner.next();

            
            if (correo.contains("@") && correo.contains(".") && correo.indexOf("@") < correo.indexOf(".")) {
            	validarCorreo = true;
                System.out.println("Correo válido: " + correo);
            } else {
                System.out.println("Correo inválido. Intente nuevamente.");
            }
        }
    }
    
    public static void ingresarContrasena() {
    	while (!validarContrasena) {
    	
    	System.out.println("ingrese una contraseña: ");	
    	contrasena = scanner.next();
    	
    	if (contrasena.length() > 6 && contrasena.length() < 12) {
    		System.out.println("contraseña correcta");
    		validarContrasena = true;
    	}
    	else {
    		System.out.println("contraseña incorrecta, intente nuevamente");
    	}
    	
    	}
    	
    }
    
    
    

    public static void main(String[] args) {
        ingresarCorreo();
        ingresarContrasena();
        
    }
}
