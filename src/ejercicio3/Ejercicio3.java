package ejercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// declaramos el número decimal
		double num;
		// declaramos el objeto scanner
		Scanner sc = new Scanner(System.in);
		// le añadimos la local de EEUU para que nos lea el punto
		sc.useLocale(Locale.US);
		
		// indicamos al usuario que introduzca el número
		System.out.println("Introduzca un número decimal:");
		// recogemos la entrada de datos por teclado
		num = sc.nextDouble();
		
		// comprobamos si es un número casi cero y mostramos el resultado por pantalla
		if(num < 1 && num > -1 && num != 0) {
			System.out.println("Es un número casi cero.");
		}else {
			System.out.println("No es un número casi cero.");
		}
		
		// cerramos el objeto scanner
		sc.close();
	}

}
