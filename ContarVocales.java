import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vector = new char[10];
        System.out.println("Ingrese 10 caracteres uno por uno:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Caracter " + (i + 1) + ": ");
            vector[i] = scanner.next().charAt(0); // Tomar solo el primer caracter
        }
        int contadorVocales = 0;
        for (int i = 0; i < vector.length; i++) {
            char c = Character.toLowerCase(vector[i]);
            // Verificar si es vocal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("\nCantidad de vocales encontradas: " + contadorVocales);
        scanner.close();
    }
}