package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		String entradaUsu0, entradaUsu1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("JUGADOR 1: ");
		entradaUsu0 = sc.nextLine().toUpperCase();
		// espacio para que el usuario 2 no vea la respuesta del usuario 1
		for(int i = 1; i<100;i++) {
			System.out.println();
		}
		
		System.out.println("JUGADOR 2: ");
		entradaUsu1 = sc.nextLine().toUpperCase();
		
		if(entradaUsu0.equals("PIEDRA") && entradaUsu1.equals("PIEDRA")
		|| entradaUsu0.equals("PAPEL") && entradaUsu1.equals("PAPEL")
		|| entradaUsu0.equals("TIJERA") && entradaUsu1.equals("TIJERA")) 
		{
			System.out.println("EMPATE");
		}else if(entradaUsu0.equals("PIEDRA") && entradaUsu1.equals("TIJERA")
		|| entradaUsu0.equals("TIJERA") && entradaUsu1.equals("PAPEL")
		|| entradaUsu0.equals("PAPEL") && entradaUsu1.equals("PIEDRA")) 
		{
			System.out.println("GANA EL JUGADOR 1. FELICIDADES");
		}else if(entradaUsu0.equals("TIJERA") && entradaUsu1.equals("PIEDRA")
		|| entradaUsu0.equals("PAPEL") && entradaUsu1.equals("TIJERA") 
		|| entradaUsu0.equals("PIEDRA") && entradaUsu1.equals("PAPEL")) 
		{
			System.out.println("GANA EL JUGADOR 2. FELICIDADES");
		}else {
			System.out.println("ENTRADA INCORRECTA. SE SUSPENDE EL JUEGO");
		}
		sc.close();
	}

}
