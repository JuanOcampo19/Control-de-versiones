import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_BuscarCoordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(10) + 1; // números entre 1 y 10
            }
        }

        System.out.println("Matriz generada:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\nIngrese el número que desea buscar: ");
        int buscado = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == buscado) {
                    System.out.println("El número " + buscado + " está en la fila " + i + ", columna " + j);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("El número " + buscado + " no se encuentra en la matriz.");
        }
        sc.close();
    }
}
