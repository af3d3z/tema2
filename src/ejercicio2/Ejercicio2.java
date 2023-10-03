package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// declaramos ambos números
		int num0, num1;
		// declaramos el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		// indicamos al usuario que introduzca el primer número
		System.out.println("Introduzca el primer número:");
		// recogemos la entrada del usuario
		num0 = sc.nextInt();
		// indicamos al usuario que introduzca el segundo número
		System.out.println("Introduzca el segundo número:");
		// recogemos la entrada del usuario
		num1 = sc.nextInt();
		
		// comprobamos si los números son iguales y mostramos el resultado por pantalla
		if(num0 == num1) {
			System.out.println("Son iguales!");
		}else {
			System.out.println("No son iguales.");
		}
	}

}
