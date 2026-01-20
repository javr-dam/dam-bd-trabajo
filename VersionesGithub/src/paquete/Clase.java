package paquete;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Clase {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();

    /*
     * Javier Gil Puian
     * @since 3.1
     * @version 3.1
     * Corrector añadido
     */

    static void menu() {
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1) Operaciones aleatorias (la máquina elige el operador)");
            System.out.println("2) Tú eliges la operación");
            System.out.println("3) Salir");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch(opcion) {
                case 1:
                    modoAleatorio();
                    break;
                case 2:
                    modoManual();
                    break;
                case 3:
                    System.out.println("Adiós. Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while(opcion != 3);
    }

    static void modoAleatorio(){
        double num1, num2, resultado;
        int numeroDeOps;
        char operacionARealizar;
        int contadorOperaciones = 0; // contador de operaciones válidas
        int contadorErrores = 0;     // contador de errores

        System.out.print("Introduce cuantas operaciones aleatorias quieres hacer: ");
        numeroDeOps = scanner.nextInt();

        for(int i = 0; i < numeroDeOps; i++){
            operacionARealizar = simbolos[random.nextInt(4)];
            System.out.printf("Operación elegida: %c\n", operacionARealizar);

            num1 = pedirNumero("Introduce el primer numero: ");
            num2 = pedirNumero("Introduce el segundo numero: ");

            if (operacionARealizar == '/' && num2 == 0) {
                System.out.println("ERROR: No se puede dividir entre 0. Se repite la operación.");
                i--;
                contadorErrores++;
                continue;
            }

            resultado = operar(num1, operacionARealizar, num2);

            if (resultado < 0) {
                System.out.println("ERROR: El resultado no puede ser negativo. Se repite la operación.");
                i--;
                contadorErrores++;
            } else {
                System.out.printf("%.2f %c %.2f = %.2f\n", num1, operacionARealizar, num2, resultado);
                contadorOperaciones++;
            }
        }

        System.out.println("Operaciones realizadas: " + contadorOperaciones);
        System.out.println("Errores cometidos: " + contadorErrores);
    }


    static void modoManual(){
        double num1, num2, resultado;
        int numeroDeOps;
        char operacionARealizar;
        int contadorOperaciones = 0;
        int contadorErrores = 0; // contador de errores

        System.out.print("Introduce cuantas operaciones quieres hacer: ");
        numeroDeOps = scanner.nextInt();

        for(int i = 0; i < numeroDeOps; i++){
            operacionARealizar = elegirOperacion();

            num1 = pedirNumero("Introduce el primer numero: ");
            num2 = pedirNumero("Introduce el segundo numero: ");

            if (operacionARealizar == '/' && num2 == 0) {
                System.out.println("ERROR: No se puede dividir entre 0. Se repite la operación.");
                i--;
                contadorErrores++;
                continue;
            }

            resultado = operar(num1, operacionARealizar, num2);

            if (resultado < 0) {
                System.out.println("ERROR: El resultado no puede ser negativo. Se repite la operación.");
                i--;
                contadorErrores++;
            } else {
                System.out.printf("%.2f %c %.2f = %.2f\n", num1, operacionARealizar, num2, resultado);
                contadorOperaciones++;
            }
        }

        System.out.println("Operaciones realizadas: " + contadorOperaciones);
        System.out.println("Errores cometidos: " + contadorErrores);
    }


    static double pedirNumero(String mensaje) {
        while(true){
            try{
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (InputMismatchException e){
                System.out.println("ERROR: Debes introducir un número.");
                scanner.next();
            }
        }
    }

    static char elegirOperacion() {
        char op;
        do {
            System.out.print("Elige la operación (+, -, *, /): ");
            op = scanner.next().charAt(0);
        } while(op != '+' && op != '-' && op != '*' && op != '/');

        return op;
    }

    static double operar(double num1, char op, double num2){
        switch(op){
            case '+': return num1+num2;
            case '-': return num1-num2;
            case '*': return num1*num2;
            case '/': return num1/num2;
        }
        return 0.0;
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al programa de operaciones");
        menu();
    }
}
