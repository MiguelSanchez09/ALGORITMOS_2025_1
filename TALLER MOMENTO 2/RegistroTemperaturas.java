import java.util.Scanner;

public class RegistroTemperaturas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[30];

        double temperaturaMax = Double.NEGATIVE_INFINITY;
        double temperaturaMin = Double.POSITIVE_INFINITY;
        double suma = 0;
        int diasCalidos = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();

            suma += temperaturas[i];

            if (temperaturas[i] > temperaturaMax) {
                temperaturaMax = temperaturas[i];
            }
            if (temperaturas[i] < temperaturaMin) {
                temperaturaMin = temperaturas[i];
            }

            if (temperaturas[i] > 25.0) {
                diasCalidos++;
            }
        }

        double promedio = suma / temperaturas.length;

        System.out.println("\n--- Resultados ---");
        System.out.println("Temperatura máxima del mes: " + temperaturaMax + " °C");
        System.out.println("Temperatura mínima del mes: " + temperaturaMin + " °C");
        System.out.printf("Temperatura promedio: %.2f °C%n", promedio);
        System.out.println("Número de días con temperatura mayor a 25°C: " + diasCalidos);

        sc.close();
    }
}