package paquete;
import java.util.Scanner;
public class Clase {
 /*
 * Nombre
 * @since 1.7
 * @version 1.7
 * Realiza una operación complicada
 */
 static void primeraFuncion() {
 Scanner sc = new Scanner(System.in);
 System.out.println("Introduce el primer valor:");
 int num1 = sc.nextInt();
 System.out.println("Introduce el segundo valor:");
 int num2 = sc.nextInt();
 System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
 System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
 System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
 if (num2 != 0) {
 System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
 } else {
 System.out.println("No se puede dividir entre 0");
 }
 System.out.printf("(%d + %d) * 2 = %d\n", num1, num2, (num1 + num2) * 2);
 sc.close();
 }
 public static void main(String[] args) {
 primeraFuncion();
 }
}