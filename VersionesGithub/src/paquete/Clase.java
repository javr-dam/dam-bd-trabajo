package paquete;
import java.util.Scanner;
public class Clase {

	/*
    * Merye Dahmani
    * @since 1.4
    * @version 1.4
    * Mejora de las primeras verisones

    */
	
        static void primeraFuncion() {
            Scanner sc = new Scanner(System.in);
            
            int num1  = sc.nextInt();
            
            int num2  = sc.nextInt();
            System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
            System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
            System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
            System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
        }

    public static void main(String[] args){

        primeraFuncion();
    }
}