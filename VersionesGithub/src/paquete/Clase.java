package paquete;

import java.util.Scanner;

public class Clase {
 /*
 * Félix Trejo Baquero
 * @since 1.8
 * @version 1.8
 * Creamos un indice para el array
 */
 static void primeraFuncion() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Introduce el primer valor:");
	 int num1 = sc.nextInt();
	 System.out.println("Introduce el segundo valor:");
	 int num2 = sc.nextInt();
	 int[] Array = new int[5];
	 int indice=0;
	 System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
	 System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
	 System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
	 if (num2 != 0) {
		 System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
	 } 
	 else {
		 System.out.println("No se puede dividir entre 0");
	 }
	 System.out.printf("(%d + %d) * 2 = %d\n", num1, num2, (num1 + num2) * 2);
	 Array[indice]=resultadoOperacion;
	 sc.close();
	 }
 public static void main(String[] args) {
	 primeraFuncion();
 }
}

