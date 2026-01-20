package paquete;
import java.util.Scanner;
public class Clase {

	/*
    * Merye Dahmani
    * @since 1.6
    * @version 1.6
    * Realiza una operacion mas complicada

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

            // División segura (evitar división por cero)
            if( num != 0){
                System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
            }else{
                System.out.printf("No se puede dividir entre cero");
            }
        }

    public static void main(String[] args){

        primeraFuncion();
    }
}