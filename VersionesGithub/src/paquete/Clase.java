package paquete;

import java.util.Scanner;
import java.util.Random;

public class Clase {
    // Declaraciones importantes
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();
    static int numeroDeEjecuciones;
    static double num1, num2;
 
    /*
     * Ignacio Jimenez Alonso
     * @since 2.2
     * @version 2.2
     * Usuario decide si maquina decide operadores o pone numeros aleatorios
     */

    static void usuarioOpera(){
        int eleccion = 0;
        num1 = random.nextDouble(100.0); // Limitar a un rango asequible
        num2 = random.nextDouble(100.0);

        System.out.printf("num1: %.2f | num2: %.2f\n", num1, num2);

        // imprimir menu
        do{
            for(int op=0;op<simbolos.length;op++){
                System.out.printf("%d) Operador: %c\n", op, simbolos[op]);
            }
            System.out.print("Respuesta: ");
            eleccion = scanner.nextInt(); // Sensible a errores de tipo char etc...
        }while(eleccion < 0 || eleccion >= simbolos.length);

        System.out.printf(
            "%.2f %c %.2f = %.2f\n",
            num1, simbolos[eleccion], num2, operar(num1, simbolos[eleccion], num2)
        );
    }

    static void maquinaOpera(){
        char operacionARealizar;
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

    static void programa(boolean usuarioOpera){
        System.out.print("Introduce cuantas ejecuciones quieres realizar: ");
        numeroDeEjecuciones = scanner.nextInt();

        scanner.nextLine(); // limpiar scanner

        for(int i=0;i<numeroDeEjecuciones;i++){
            if(usuarioOpera) usuarioOpera();
            else maquinaOpera();
        }
    }

    static void primeraFuncion(){
        String respuestaUsuario;
        do{
            System.out.print("Quieres elegir las operaciones? (Y/N): ");
            respuestaUsuario = scanner.nextLine().toUpperCase();
        }while(!respuestaUsuario.equals("Y") && !respuestaUsuario.equals("N"));

        programa(respuestaUsuario.equals("Y"));
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