package ejercicio5;

import java.util.Scanner;

public class Ejercicio5Cpy {
	public static void main(String[] args) {
		int a, b, c = 0;
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		a = sc.nextInt();
		
		System.out.println("Introduce el segundo número:");
		b = sc.nextInt();
		
		System.out.println("Introduce el tercer número:");
		c = sc.nextInt();
		
		if(a > b && b > c) {
			System.out.println(a + " " + b + " " + c);
		}else if(a < b && b < c) {
			System.out.println(c + " " + b + " " + a);
		}else if(a > b && b < c) {
			System.out.println(a + " " + c + " " + b);
		}else if(a < b && b > c) {
			System.out.println(b + " " + a + " " + c);
		}else if(a > b && a < c && b < c) {
			System.out.println(c + " " + a + " " + b);
		}
		
		sc.close();
	}
}
