import java.util.Scanner;

public class GestionCalificaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int estudiantes = sc.nextInt();
        double[][] calificaciones = new double[estudiantes][3];
        double[] promedios = new double[estudiantes];

        int aprobados = 0;

        for (int i = 0; i < estudiantes; i++) {
            double suma = 0;
            System.out.println("Ingrese las calificaciones del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Examen " + (j + 1) + ": ");
                calificaciones[i][j] = sc.nextDouble();
                suma += calificaciones[i][j];
            }
            promedios[i] = suma / 3;
            if (promedios[i] >= 6.0) aprobados++;
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + " - Promedio: " + promedios[i]);
        }

        System.out.println("\nAprobados: " + aprobados);
        System.out.println("Reprobados: " + (estudiantes - aprobados));

        sc.close();
    }
}