package org.cuatrovientos.dam.julen.calculadora;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Solicitar la operación
		String operacion = MenuInicial(scanner);

		// Solicitar el primer número
		System.out.print("Introduce el primer número: ");
		double numero1 = scanner.nextDouble();

		// Solicitar el segundo número
		System.out.print("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble();

		// Calcular el resultado
		double resultado;
		switch (operacion) {
		
		case "1":
			resultado = numero1 + numero2;
			System.out.println("resultado: " + resultado);
			break;
			
		case "2":
			resultado = numero1 - numero2;
			System.out.println("resultado: " + resultado);
			break;
			
		case "3":
			resultado = numero1 * numero2;
			System.out.println("resultado: " + resultado);
			break;
			
		case "4":
			if(numero2 == 0) {
				System.out.println("No hay resultado, no se puede dividir por 0.");
			}
			else {
				resultado = numero1 / numero2;
				System.out.println("resultado: " + resultado);				
			}
			break;
			
		default:
			System.out.println("Operación no válida. Por favor, elige suma, resta, multiplicacion o division.");
		}

		scanner.close();
	}

	private static String MenuInicial(Scanner scanner) {
		System.out.println("Calculadora Cuatrovientos");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación");
		System.out.println("4. División");
		System.out.print("Introduce la operación (1,2,3 o 4): ");
		String operacion = scanner.nextLine().toLowerCase();
		return operacion;
	}
}
