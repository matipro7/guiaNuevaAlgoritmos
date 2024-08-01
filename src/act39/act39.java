package act39;

import java.util.Scanner;

public class act39 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		Diasmes mes;
		String dias;
		
		System.out.println("ingrese el dia del mes: ");
		dias = scanner.nextLine().toUpperCase();
		
		mes = Diasmes.valueOf(dias);
		
		switch (mes) {
		
		case ENERO :System.out.println("tiene 31 dias: ");
			break;
		case FEBRERO : 	System.out.println("tiene 29 dias: ");
			break;
		case MARZO :System.out.println("tiene 31 dias: ");
			break;
		case ABRIL : System.out.println("tiene 30 dias: ");
			break;
		case MAYO :System.out.println("tiene 31 dias: ");
			break;
		case JUNIO :System.out.println("tiene 30 dias: ");
			break;
		case JULIO :System.out.println("tiene 31 dias: ");
			break;
		case AGOSTO :System.out.println("tiene 31 dias: ");
			break;
		case SEPTIEMBRE :System.out.println("tiene 30 dias: ");
			break;
		case OCTUBRE :System.out.println("tiene 31 dias: ");
			break;
		case NOVIEMBRE :System.out.println("tiene 30 dias: ");
			break;
		case DICIEMBRE :System.out.println("tiene 31 dias: ");
			break;
			
		}
		
	}

}
