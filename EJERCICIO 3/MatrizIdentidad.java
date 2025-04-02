import java.util.Scanner;
public class MatrizIdentidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero para la matriz identidad (n): ");
        int n = scanner.nextInt();
        int[][] identidad = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    identidad[i][j] = 1;
                } else {
                    identidad[i][j] = 0; 
                }
            }
        }
        System.out.println("\nMatriz identidad de tamaño " + n + "x" + n + ":");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(identidad[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
} 