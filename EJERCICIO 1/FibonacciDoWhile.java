import java.util.Scanner;

public class FibonacciDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números de la serie de Fibonacci a imprimir: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1, count = 0;
        
        System.out.print("Serie de Fibonacci: ");
        do {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        } while (count < n);
        
        scanner.close();
    }
}