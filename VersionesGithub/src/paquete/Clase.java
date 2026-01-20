package paquete;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Clase {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();


	/*
    * Felix Trejo Baquero
    * @since 1.7
    * @version 1.7
    * Añadimos un array


    */
	
        static void primeraFuncion() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el primer numero");
            int num1  = sc.nextInt();
            
            System.out.println("Introduce el segundo numero");
            int num2  = sc.nextInt();
            int[] Array = new int[5];
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
