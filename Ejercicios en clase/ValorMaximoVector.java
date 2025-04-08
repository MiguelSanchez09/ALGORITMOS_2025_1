import java.util.Scanner;
public class ValorMaximoVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[8];
        System.out.println("Ingrese 8 números enteros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        int maximo = vector[0];  
        int posicion = 0;    
        
        for (int i = 1; i < vector.length; i++) {
            if (vector[i] > maximo) {
                maximo = vector[i]; 
                posicion = i;     
            }
        }
        System.out.println("\nEl valor máximo es: " + maximo);
        System.out.println("Se encuentra en la posición: " + posicion);
        scanner.close();
    }
}