package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int primerNum, segundoNum, tercerNum, suma;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		primerNum = sc.nextInt();
		
		System.out.println("Introduce el segundo número:");
		segundoNum = sc.nextInt();
		
		System.out.println("Introduce el tercer número:");
		tercerNum = sc.nextInt();
		
		suma = primerNum + segundoNum;
		
		if (suma == tercerNum) {
			System.out.println("La suma de los primeros dos números equivale al tercero");
		}else {
			System.out.println("La suma de los primeros dos números no equivale al tercero");
		}
		
		
	}

}
