package act53;

import java.util.Scanner;

public class act53 {

	static int notaMay, notaMen;
	static int numMayor = 0;
	static int numMenor = 0;
	static int suma = 0;
	static Scanner scanner = new Scanner(System.in);
	
	static int nota;
	
	public static void ingresarNota() {
		
		System.out.println("ingresa 5 notas");
		for (int i =1; i<=5; i++) {
			
			System.out.println("profesor ingrese la calificacion: ");
			nota = scanner.nextInt();
			numMayor = 0;
			numMenor = 0;
			if (i== 0) {
				numMayor = nota;
				numMenor = nota;
			}
			else if (nota>numMayor) {
				
				numMayor = nota;
				
				}
			if (nota<numMenor) {
				numMenor = nota;
					}
			suma= suma+ nota;;
		}
	}
	
	public static void mayorMenor() {
		
		System.out.println("El numero mayor es: "+numMayor);
		System.out.println("El numero mayor es: "+numMenor);
	}
		
		public static void promedio () {
			
			int promedio = suma/5;
			
			System.out.println("El promedio de todas las calificaciones es= "+promedio);
			
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ingresarNota();
		mayorMenor();
		promedio();
	}

}
