import java.util.Scanner;

public class Ejercicio2_Transpuesta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] original = new int[4][4];
        int[][] transpuesta = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                original[i][j] = sc.nextInt();
                transpuesta[j][i] = original[i][j];
            }
        }

        System.out.println("\nMatriz original:");
        mostrar(original);

        System.out.println("\nMatriz transpuesta:");
        mostrar(transpuesta);
        sc.close();
    }

    static void mostrar(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print("| " + m[i][j] + "\t");
            }
            System.out.println("|");
        }
    }
}
