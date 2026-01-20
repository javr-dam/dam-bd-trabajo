package paquete;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Clase {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();

    /*
     * Dario Baquero
     * @since 2.7
     * @version 2.7
     * Se añade opción para elegir la operación a realizar.
     */

    static void primeraFuncion(){
        double num1 = 0.0, num2 = 0.0;
        int numeroDeOps;
        char operacionARealizar;

        System.out.print("Introduce cuantas operaciones aleatorias quieres hacer: ");
        numeroDeOps = scanner.nextInt();

        for(int i = 0; i < numeroDeOps; i++){

            // Pide al usuario elegir operación
            System.out.print("Elige la operación (+, -, *, /): ");
            operacionARealizar = scanner.next().charAt(0);

            // Validar operación
            while (operacionARealizar != '+' && operacionARealizar != '-' &&
                   operacionARealizar != '*' && operacionARealizar != '/') {
                System.out.print("Operación no válida. Elige (+, -, *, /): ");
                operacionARealizar = scanner.next().charAt(0);
            }

            double resultado;

            while (true) {

                while(true){
                    try{
                        System.out.print("Introduce el primer numero: ");
                        num1 = scanner.nextDouble();
                        break;
                    } catch (InputMismatchException e){
                        System.out.println("ERROR: Debes introducir un número.");
                        scanner.next();
                    }
                }

                while(true){
                    try{
                        System.out.print("Introduce el segundo numero: ");
                        num2 = scanner.nextDouble();
                        break;
                    } catch (InputMismatchException e){
                        System.out.println("ERROR: Debes introducir un número.");
                        scanner.next();
                    }
                }

                if (operacionARealizar == '/' && num2 == 0) {
                    System.out.println("ERROR: No se puede dividir entre 0. Repite la operación.");
                    continue;
                }

                resultado = operar(num1, operacionARealizar, num2);

                if (resultado < 0) {
                    System.out.println("ERROR: El resultado no puede ser negativo. Repite la operación.");
                } else {
                    System.out.printf("%.2f %c %.2f = %.2f\n",
                            num1, operacionARealizar, num2, resultado);
                    break; // operación válida
                }
            }
        }
    }

    static double operar(double num1, char op, double num2){
        switch(op){
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '*': return num1*num2;
            case '/':
                if(num2 == 0) return Double.NaN;
                return num1/num2;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de operaciones aleatorias");
        primeraFuncion();
        System.out.println("Adiós. Gracias por usar el programa.");
    }
}