package paquete;

import java.util.Scanner;

public class Clase {

    /*
     * Félix Trejo Baquero
     * @since 1.9
     * @version 1.9
     * Programa para operaciones básicas y guardar resultados en un array
     */
    static void primeraFuncion() {
        Scanner sc = new Scanner(System.in);
        int[] resultados = new int[5]; // Array para guardar resultados
        int indice = 0; // Índice inicial
        boolean continuar = true; // Control del bucle

        while (continuar && indice < resultados.length) {
            System.out.println("Introduce el primer valor:");
            int num1 = sc.nextInt();
            System.out.println("Introduce el segundo valor:");
            int num2 = sc.nextInt();

            int suma = num1 + num2;
            System.out.printf("%d + %d = %d\n", num1, num2, suma);
            resultados[indice] = suma; // Guardamos el resultado
            indice++;

            int resta = num1 - num2;
            System.out.printf("%d - %d = %d\n", num1, num2, resta);
            if (indice < resultados.length) {
                resultados[indice] = resta;
                indice++;
            }

            int multiplicacion = num1 * num2;
            System.out.printf("%d * %d = %d\n", num1, num2, multiplicacion);
            if (indice < resultados.length) {
                resultados[indice] = multiplicacion;
                indice++;
            }

            if (num2 != 0) {
                int division = num1 / num2;
                System.out.printf("%d / %d = %d\n", num1, num2, division);
                if (indice < resultados.length) {
                    resultados[indice] = division;
                    indice++;
                }
            } else {
                System.out.println("No se puede dividir entre 0");
            }

            int otraOp = (num1 + num2) * 2;
            System.out.printf("(%d + %d) * 2 = %d\n", num1, num2, otraOp);
            if (indice < resultados.length) {
                resultados[indice] = otraOp;
                indice++;
            }

            if (indice < resultados.length) {
                System.out.println("¿Quieres hacer otra operación? (s/n)");
                char respuesta = sc.next().charAt(0);
                if (respuesta == 'n' || respuesta == 'N') {
                    continuar = false;
                }
            } else {
                System.out.println("Se alcanzó el límite de resultados guardados.");
            }
        }

        System.out.println("\nResultados guardados:");
        for (int i = 0; i < indice; i++) {
            System.out.println("Posición " + i + ": " + resultados[i]);
        }

        sc.close();
    }

    public static void main(String[] args) {
        primeraFuncion();
    }
}