package paquete;
import java.util.Scanner;
public class Clase {

	/*
    * Merye Dahmani
    * @since 1.5
    * @version 1.5
    * Se definen los numeros

    */
	
        static void primeraFuncion() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el primer numero");
            int num1  = sc.nextInt();
            System.out.println("Introduce el segundo numero");
            
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