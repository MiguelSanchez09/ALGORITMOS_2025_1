import java.util.Scanner;

public class TorneoPuntuaciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] puntuaciones = new int[5];

        int puntuacionMaxima = Integer.MIN_VALUE; 

        System.out.println("Ingrese las 5 puntuaciones de los jugadores:");

        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Puntuación jugador " + (i + 1) + ": ");
            puntuaciones[i] = teclado.nextInt();

            if (puntuaciones[i] > puntuacionMaxima) {
                puntuacionMaxima = puntuaciones[i];
            }
        }

        System.out.println("\nPuntuaciones ingresadas:");
        for (int k = 0; k < puntuaciones.length; k++) {
            System.out.println(puntuaciones[k]);
        }

        System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima);

        teclado.close();
    }
}