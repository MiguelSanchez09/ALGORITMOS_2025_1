import java.util.Scanner;
public class MatrizNotasCalculoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] notas = new double[3][4]; 
        System.out.println("Ingrese las notas de 3 estudiantes en 4 asignaturas:");
        for (int i = 0; i < 3; i++) { 
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) { 
                System.out.print("  Nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("\nPromedios de los estudiantes:");
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += notas[i][j]; 
            }
            double promedio = suma / 4; 
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }
        scanner.close();
    }
} 