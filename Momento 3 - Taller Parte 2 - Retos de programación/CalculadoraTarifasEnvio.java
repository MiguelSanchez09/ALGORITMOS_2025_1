import java.util.Scanner;

public class CalculadoraTarifasEnvio {
    public static final double COSTO_BASE_LOCAL = 5000.0;
    public static final double COSTO_BASE_NACIONAL = 15000.0;
    public static final double COSTO_BASE_INTERNACIONAL = 50000.0;
    public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
    public static final double COSTO_ADICIONAL_POR_KG_NACIONAL = 3000.0;
    public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL = 10000.0;

    public static double calcularCostoAdicionalPorPeso(double pesoKg, int zona) {
        double costoAdicional = 0.0;
        if (pesoKg < 0) {
            return 0.0;
        }
        switch (zona) {
            case 1:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
                break;
            case 2:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
                break;
            case 3:
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo adicional.");
                costoAdicional = 0.0;
                break;
        }
        return costoAdicional;
    }

    public static double obtenerCostoBasePorZona(int zona) {
        switch (zona) {
            case 1: return COSTO_BASE_LOCAL;
            case 2: return COSTO_BASE_NACIONAL;
            case 3: return COSTO_BASE_INTERNACIONAL;
            default: return 0.0;
        }
    }

    public static double calcularTarifaTotal(double pesoKg, int zona) {
        double base = obtenerCostoBasePorZona(zona);
        double adicional = calcularCostoAdicionalPorPeso(pesoKg, zona);
        return base + adicional;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Calculadora de Tarifas de Envío Logística Veloz S.A. ---");

        double pesoPaquete;
        do {
            System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
            pesoPaquete = scanner.nextDouble();
            if (pesoPaquete <= 0) {
                System.out.println("El peso debe ser positivo.");
            }
        } while (pesoPaquete <= 0);

        int zonaEnvio;
        do {
            System.out.println("Seleccione la zona de envío:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Internacional");
            System.out.print("Opción (1-3): ");
            zonaEnvio = scanner.nextInt();
            if (zonaEnvio < 1 || zonaEnvio > 3) {
                System.out.println("Zona inválida. Intente de nuevo.");
            }
        } while (zonaEnvio < 1 || zonaEnvio > 3);

        double tarifaFinal = calcularTarifaTotal(pesoPaquete, zonaEnvio);

        System.out.println("\n--- Detalle del Envío ---");
        System.out.println("Peso del Paquete: " + pesoPaquete + " kg");
        String nombreZona = switch (zonaEnvio) {
            case 1 -> "Local";
            case 2 -> "Nacional";
            case 3 -> "Internacional";
            default -> "Desconocida";
        };
        System.out.println("Zona de Destino: " + nombreZona);
        System.out.println("Tarifa Total de Envío: $" + String.format("%,.2f", tarifaFinal));
        System.out.println("---------------------------");

        scanner.close();
    }
}
