import java.util.Scanner;

public class RegistroTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[7];
        System.out.println("Ingrese la temperatura diaria durante 7 días:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        double suma = 0;
        boolean hayFiebre = false;
        
        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i]; 
            if (temperaturas[i] > 38) { 
                hayFiebre = true;
                System.out.println("¡Alerta! Fiebre detectada el día " + (i + 1) + ": " + temperaturas[i] + "°C");
            }
        }

        double promedio = suma / temperaturas.length;
        System.out.printf("\nPromedio de temperaturas: %.2f°C%n", promedio);

        if (!hayFiebre) {
            System.out.println("No se detectaron casos de fiebre (temperaturas > 38°C).");
        }
        
        scanner.close();
    }
}