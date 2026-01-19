package paquete;

public class Clase {

	/*
    * Javier Enríquez
    * @since 1.3
    * @version 1.3
    * Versión con una función mas expandida.
    */
	
	static void primeraFuncion() {
		int num1 = 6, num2 = 7;
		System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
	}
	
	public static void main(String[] args) {
		primeraFuncion();
	}

}
