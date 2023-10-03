package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		// declaramos las variables que guardarán los númros
		int num0, num1;
		// declaramos el objeto scanner
		Scanner sc = new Scanner(System.in);
		
		// pedimos el primer número
		System.out.println("Introduce el primer número:");
		// asignamos a la variable num0 el valor introducido por teclado
		num0 = sc.nextInt();
		
		// pedimos el segundo número
		System.out.println("Introduce el segundo número:");
		// asignamos a la variable num1 el valor introducido por teclado
		num1 = sc.nextInt();
		
		// comprobamos cual es el mayor y mostramos el resultado por pantalla
		if(num0 > num1) {
			System.out.println(num0 + " > " + num1);
		}else if(num0 < num1) {
			System.out.println(num0 + " < " + num1);
		}else {
			System.out.println(num0 + " = " + num1);
		}
		
		// cerramos el scanner
		sc.close();
	}
}
