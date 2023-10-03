package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		int[] num = new int[3];
		int temp = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		num[0] = sc.nextInt();
		
		System.out.println("Introduce el segundo número:");
		num[1] = sc.nextInt();
		
		System.out.println("Introduce el tercer número:");
		num[2] = sc.nextInt();
		
		
		for(int i = 0; i<num.length;i++) {
			for(int j = i+1; j<num.length;j++) {
				if(num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		
		System.out.println(num[0] + " > " + num[1] + " > " + num[2]);
		
		sc.close();
	}
}
