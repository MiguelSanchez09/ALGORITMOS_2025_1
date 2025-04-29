import java.util.Scanner;
public class ConversorUnidades {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- Conversor de Unidades ---");
            System.out.println("1. Metros a centímetros");
            System.out.println("2. Kilómetros a metros");
            System.out.println("3. Grados Celsius a Fahrenheit");
            System.out.println("4. Grados Fahrenheit a Celsius");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirMetrosACentimetros();
                    break;
                case 2:
                    convertirKilometrosAMetros();
                    break;
                case 3:
                    convertirCelsiusAFahrenheit();
                    break;
                case 4:
                    convertirFahrenheitACelsius();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }
    static void convertirMetrosACentimetros() {
        System.out.print("Ingrese los metros: ");
        double metros = scanner.nextDouble();
        double centimetros = metros * 100;
        System.out.println(metros + " metros son " + centimetros + " centímetros.");
    }
    static void convertirKilometrosAMetros() {
        System.out.print("Ingrese los kilómetros: ");
        double km = scanner.nextDouble();
        double metros = km * 1000;
        System.out.println(km + " kilómetros son " + metros + " metros.");
    }
    static void convertirCelsiusAFahrenheit() {
        System.out.print("Ingrese los grados Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C son " + fahrenheit + "°F.");
    }
    static void convertirFahrenheitACelsius() {
        System.out.print("Ingrese los grados Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F son " + celsius + "°C.");
    }
}
