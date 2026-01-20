package paquete;

import java.util.Scanner;
import java.util.Random;

    /*
     * Ignacio Jimenez Alonso
     * @since 2.1
     * @version 2.1
     * Programa de operaciones aleatorias aplicadas a 2 numeros introducidos por el usuario
     */
public class Clase {
    // Declaraciones importantes
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();
 
    static void primeraFuncion(){
        double num1 = 0.0, num2 = 0.0;
        int numeroDeOps;
        char operacionARealizar;
        System.out.print("Introduce cuantas operaciones aleatorias quieres hacer: ");
        numeroDeOps = scanner.nextInt();
        
        for(int i=0;i<numeroDeOps;i++){

            operacionARealizar = simbolos[random.nextInt(4)];

            System.out.printf("Se va a realizar la siguiente operacion: (%c)\n", operacionARealizar);

            System.out.print("Introduce el primer numero: ");
            num1 = scanner.nextDouble();
            
            System.out.print("Introduce el segundo numero: ");
            num2 = scanner.nextDouble();

            if(operacionARealizar == '/' && num2 == 0){
                System.out.printf(
                "No se puede realizar la operacion %.2f %c %.2f " +
                "ya que no se puede dividir entre 0\n", num1, operacionARealizar, num2
            );
            }else{
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
                if(num2 == 0) return Double.NaN; // Este ya NO deberia suceder
                return num1/num2;
        }
        return 0.0; // sshhh compiler
    }

    public static void main(String[] args) {
        primeraFuncion();
    }
}