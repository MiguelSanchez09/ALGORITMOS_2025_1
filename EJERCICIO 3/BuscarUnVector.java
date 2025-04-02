import java.util.Scanner;
public class BuscarUnVector {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int[] numeros = new int[10]; 
       boolean encontrado = false;
       System.out.println("Ingrese 10 números enteros:");
       for (int i = 0; i < numeros.length; i++) {
           System.out.print("Número " + (i + 1) + ": ");
           numeros[i] = scanner.nextInt();
       }
       System.out.print("Ingrese el número que desea buscar: ");
       int numeroBuscado = scanner.nextInt();
       for (int i = 0; i < numeros.length; i++) {
           if (numeros[i] == numeroBuscado) {
               encontrado = true;
               break; 
           }
       }
       if (encontrado) {
           System.out.println("El número " + numeroBuscado + " se encuentra en el vector.");
       } else {
           System.out.println("El número " + numeroBuscado + " NO se encuentra en el vector.");
       }
       scanner.close();
   }
}