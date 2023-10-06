package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		int a, b, c;
		double x0, x1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor de a: ");
		a = sc.nextInt();
		
		System.out.println("Ingrese el valor de b: ");
		b = sc.nextInt();
		
		System.out.println("Ingrese el valor de c: ");
		c = sc.nextInt();
		
		if(a == 0) {
			System.out.println("Es una ecuación de primer grado");
			x0 = -c/b;
			System.out.println("x = " + x0);
			System.exit(0);
		}else {
			// calculamos los dos posibles resultados
			x0 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
			x1 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c)) / (2*a);
						
			// mostramos el resultado por pantalla
			System.out.println("x0 = " + x0);
			System.out.println("x1 = " + x1);	
		}
		sc.close();
	}
}
