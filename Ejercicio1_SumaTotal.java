import java.util.Scanner;

public class Ejercicio1_SumaTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int suma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el valor de la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
                suma += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nLa suma de todos los elementos es: " + suma);
        sc.close();
    }
}
