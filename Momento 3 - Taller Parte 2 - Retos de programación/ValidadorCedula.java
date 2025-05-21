import java.util.Scanner;

public class ValidadorCedula {

    public static boolean esFormatoCedulaValido(String numeroCedula) {
        if (numeroCedula.length() != 10) {
            return false;
        }
        if (numeroCedula.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < numeroCedula.length(); i++) {
            if (!Character.isDigit(numeroCedula.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema Validador de Formato de Cédulas");

        String continuar;

        do {
            System.out.print("Ingrese el número de cédula a validar: ");
            String cedula = scanner.nextLine();

            if (esFormatoCedulaValido(cedula)) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            System.out.print("¿Desea validar otra cédula? (S/N): ");
            continuar = scanner.nextLine().trim().toLowerCase();
        } while (continuar.equals("s"));

        System.out.println("Gracias por usar el sistema.");
        scanner.close();
    }
}
