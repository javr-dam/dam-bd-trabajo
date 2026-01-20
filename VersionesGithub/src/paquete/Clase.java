package paquete;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Clase {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();

    /*
     * Francisco Javier Rodriguez Meneses
     * @since 2.4
     * @version 2.4
     * Se añade control de excepciones para evitar errores si el usuario introduce letras.
     */

    static void primeraFuncion(){
        double num1 = 0.0, num2 = 0.0;
        int numeroDeOps;
        char operacionARealizar;

        System.out.print("Introduce cuantas operaciones aleatorias quieres hacer: ");
        numeroDeOps = scanner.nextInt();

        for(int i=0;i<numeroDeOps;i++){

            operacionARealizar = simbolos[random.nextInt(4)];
            System.out.printf("Se va a realizar la siguiente operacion: (%c)\n", operacionARealizar);
            while(true){
                try{
                    System.out.print("Introduce el primer numero: ");
                    num1 = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e){
                    System.out.println("ERROR: Debes introducir un número.");
                    scanner.next(); // limpiar el buffer
                }
            }

            while(true){
                try{
                    System.out.print("Introduce el segundo numero: ");
                    num2 = scanner.nextDouble();
                    break;
                } catch (InputMismatchException e){
                    System.out.println("ERROR: Debes introducir un número.");
                    scanner.next(); // limpiar el buffer
                }
            }

            if(operacionARealizar == '/' && num2 == 0){
                System.out.printf(
                    "No se puede realizar la operacion %.2f %c %.2f " +
                    "ya que no se puede dividir entre 0\n", num1, operacionARealizar, num2
                );
            } else {
                System.out.printf("%.2f %c %.2f = %.2f\n",
                    num1, operacionARealizar, num2, operar(num1, operacionARealizar, num2)
                );
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
        primeraFuncion();
        System.out.println("Adiós. Gracias por usar el programa.");
    }
}