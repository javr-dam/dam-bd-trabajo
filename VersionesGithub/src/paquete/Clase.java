package paquete;

import java.util.Scanner;
import java.util.Random;

public class Clase {
    // Declaraciones importantes
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();
    static double[] resultados = new double[4];
    static String respuestaContinuar = "Y";
    static double resultadoRandom = 0.0f;
 
    /*
     * Ignacio Jimenez Alonso
     * @since 2.0
     * @version 2.0
     * Programa de operaciones basicas y guardado de valores en array + Revamp total de codigo +
     * operaciones aleatorias aplicadas y sumadas a una variable.
     */

    static void primeraFuncion(){
        double num1 = 0.0, num2 = 0.0;
        while(respuestaContinuar.equals("Y")){ // Continuar bucle mientras respuesta sea Y

            System.out.println("Introduce el primer valor: ");
            num1 = scanner.nextDouble();

            System.out.println("Introduce el segunda valor: ");
            num2 = scanner.nextDouble();
            
            scanner.nextLine(); // limpiar salto de linea

            // Elige entre suma resta multiplicacion aleatoriamente y se le suma a una variable
            resultadoRandom += operar(num1, simbolos[random.nextInt(3)], num2);

            for(int i=0;i<simbolos.length;i++){
                resultados[i] = operar(num1, simbolos[i], num2);
                if(!Double.isNaN(resultados[i])) // No ha dividido entre 0
                    System.out.printf("%.2f %c %.2f = %.2f\n", num1, simbolos[i], num2, resultados[i]);
                else
                    System.out.printf("Dividir %.2f entre %.2f es ilogico, no se puede dividir entre 0\n", num1, num2);
            }

            // Bucle para saber si continuar, solo acepta Y o N, sino volvera a preguntar
            do{
                System.out.print("Quiere continuar con el programa? (Y/N): ");
                respuestaContinuar = scanner.nextLine().toUpperCase(); // Volver la respuesta a mayuscula
            }while(!respuestaContinuar.equals("Y") && !respuestaContinuar.equals("N"));
        }

        System.out.println("Ultimos resultados finales guardados: ");
        for(int i=0;i<simbolos.length;i++){
            if(!Double.isNaN(resultados[i]))
                System.out.printf("%.2f %c %.2f = %.2f\n", num1, simbolos[i], num2, resultados[i]);
        }

        System.out.printf("Valor aleatorio acumulado: %.2f", resultadoRandom);
        
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
        return 0.0; // sshhh compiler
    }

    public static void main(String[] args) {
        primeraFuncion();
    }
}