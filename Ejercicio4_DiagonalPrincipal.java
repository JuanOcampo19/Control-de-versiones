import java.util.Random;

public class Ejercicio4_DiagonalPrincipal {
    public static void main(String[] args) {
        int n = 4;
        int[][] matriz = new int[n][n];
        Random random = new Random();
        int sumaDiagonal = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(50) + 1; // número entre 1 y 50
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            sumaDiagonal += matriz[i][i];
        }

        System.out.println("\nLa suma de la diagonal principal es: " + sumaDiagonal);
    }
}
