package VETORESeMATRIZES;

import java.util.Scanner;

public class ProdutoDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produto = 1;

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int j = 2 - i;
            produto *= matriz[i][j];
        }

        System.out.println("Produto dos elementos da diagonal secundária: " + produto);

    }
}

