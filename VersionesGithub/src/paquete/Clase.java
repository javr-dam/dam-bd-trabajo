package paquete;
<<<<<<< HEAD

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

=======
import java.util.Scanner;
>>>>>>> db249c4 (version 1.4)
public class Clase {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static char[] simbolos = "+-*/".toCharArray();

<<<<<<< HEAD
    /*
     * Javier Gil Puian
     * @since 2.9
     * @version 2.9
     * Menú para elegir modo
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
        int contadorOperaciones = 0; // <-- añadido

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
                continue;
            }

            resultado = operar(num1, operacionARealizar, num2);

            if (resultado < 0) {
                System.out.println("ERROR: El resultado no puede ser negativo. Se repite la operación.");
                i--;
            } else {
                System.out.printf("%.2f %c %.2f = %.2f\n", num1, operacionARealizar, num2, resultado);
                contadorOperaciones++; // <-- añadido
            }
        }

        System.out.println("Operaciones realizadas: " + contadorOperaciones); // <-- añadido
    }


    static void modoManual(){
        double num1, num2, resultado;
        int numeroDeOps;
        char operacionARealizar;

        System.out.print("Introduce cuantas operaciones quieres hacer: ");
        numeroDeOps = scanner.nextInt();

        for(int i = 0; i < numeroDeOps; i++){
            operacionARealizar = elegirOperacion();

            num1 = pedirNumero("Introduce el primer numero: ");
            num2 = pedirNumero("Introduce el segundo numero: ");

            if (operacionARealizar == '/' && num2 == 0) {
                System.out.println("ERROR: No se puede dividir entre 0. Se repite la operación.");
                i--;
                continue;
            }

            resultado = operar(num1, operacionARealizar, num2);

            if (resultado < 0) {
                System.out.println("ERROR: El resultado no puede ser negativo. Se repite la operación.");
                i--; // repetir
            } else {
                System.out.printf("%.2f %c %.2f = %.2f\n", num1, operacionARealizar, num2, resultado);
            }
        }
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

=======
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
>>>>>>> db249c4 (version 1.4)
