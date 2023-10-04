package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		int numero;
		String numeroCadena;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número:");
		numero = sc.nextInt();
		
		if(numero >= 0 && numero < 99999) {
			numeroCadena = Integer.toString(numero);
			System.out.println("El número tiene: " + numeroCadena.length() + " dígitos.");
		}else{
			System.out.println("El número está fuera de rango, inténtelo de nuevo con otro número.");
		}
		
	}

}
