package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// declaramos la variable numero
		int num;
		// declaramos el scanner
		Scanner sc = new Scanner(System.in);
		
		//indicamos al usuario que introduzca un número
		System.out.println("Introduce un número:");
		// recogemos la entrada por teclado del número
		num = sc.nextInt();
		
		// comprobamos si el número es par y devolvemos el resultado por pantalla
		if(num % 2 == 0) {
			System.out.println("Es par.");
		}else {
			System.out.println("Es impar.");
		}
		// cerramos el objeto scanner
		sc.close();
	}

}
