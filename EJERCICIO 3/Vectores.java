import java.util.Scanner;
public class Vectores {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] numeros = new int[5]; 
       int suma = 0;
       System.out.println("Ingrese 5 números enteros:");
       for (int i = 0; i < numeros.length; i++) {
           System.out.print("Número " + (i + 1) + ": ");
           numeros[i] = scanner.nextInt();
       }
       for (int i = 0; i < numeros.length; i++) {
           suma += numeros[i];
       }
       System.out.println("La suma total de los elementos es: " + suma);
       scanner.close();
   }
}