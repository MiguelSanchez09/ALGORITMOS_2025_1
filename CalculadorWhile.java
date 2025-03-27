/*
 * Estás desarrollando una pequeña calculadora que permita al usuario realizar 
 * varias operaciones matemáticas simples (suma, resta, multiplicación y división). 
 * El programa debe mostrar un menú de opciones y permitir al usuario realizar tantas 
 * operaciones como desee. El programa solo debe finalizar cuando el usuario seleccione 
 * la opción de salir.
 */

import java.util.Scanner;

public class CalculadorWhile {
    public static void main(String[] args) {
        int numA = 0, numB = 0;
        int varControl = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenidos");

        while (varControl != 6) {
            System.out.println("1. Sumar dos números\r\n" + //
                    "2. Restar dos números\r\n" + //
                    "3. Multiplicar dos números\r\n" + //
                    "4. Dividir dos números\r\n" + //
                    "5. Factorial de un número\r\n" + //
                    "6. Salir\r\n");
            System.out.print("Opción seleccionada: ");
            varControl = scanner.nextInt();

            switch (varControl) {
                case 1:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " + " + numB + " = " + (numA + numB));
                    break;
                case 2:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " - " + numB + " = " + (numA - numB));
                    break;
                case 3:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();

                    System.out.println(numA + " * " + numB + " = " + (numA * numB));
                    break;
                case 4:
                    System.out.print("Ingrese número A: ");
                    numA = scanner.nextInt();
                    System.out.print("Ingrese número B: ");
                    numB = scanner.nextInt();
                    
                    if (numB != 0) {
                        System.out.println(numA + " / " + numB + " = " + (numA / numB));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese un número para calcular su factorial: ");
                    int num = scanner.nextInt();
                    int factorial = 1, i = 1;
                    do {
                        factorial *= i;
                        i++;
                    } while (i <= num);
                    System.out.println("El factorial de " + num + " es " + factorial);
                    break;
                case 6:
                    System.out.println("Gracias, hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida!");
                    break;
            }
        }
        scanner.close();
    }
}
