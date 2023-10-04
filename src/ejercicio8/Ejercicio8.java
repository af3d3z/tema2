package ejercicio8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		double nota;
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduzca la nota:");
		nota = sc.nextDouble();
		
		if(nota >= 0 && nota < 5){
			System.out.println("INSUFICIENTE");
		}else if(nota >= 5 && nota < 6){
			System.out.println("SUFICIENTE");
		}else if(nota >= 6 && nota < 7) {
			System.out.println("BIEN");
		}else if(nota >= 7 && nota < 9) {
			System.out.println("NOTABLE");
		}else if(nota >= 9 && nota <= 10) {
			System.out.println("SOBRESALIENTE");
		}else {
			System.out.println("Ha introducido una nota incorrecta, compruebe que está dentro del rango [0-10].");
		}
	}

}
