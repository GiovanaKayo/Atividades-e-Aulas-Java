package atividades;

import java.util.Scanner;

public class Ex102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] produto = new int[2][2];


        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                produto[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    produto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Produto das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(produto[i][j] + " ");
            }
        }

    }
}
