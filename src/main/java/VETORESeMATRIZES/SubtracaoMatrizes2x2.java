package VETORESeMATRIZES;

import java.util.Scanner;

public class SubtracaoMatrizes2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizSubtracao = new int[2][2];

        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSubtracao[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }

        System.out.println("Resultado da subtração (matriz A - matriz B):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSubtracao[i][j] + "\t");
            }
        }

    }
}
