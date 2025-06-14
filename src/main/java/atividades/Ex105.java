package atividades;

import java.util.Scanner;

public class Ex105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] somaColunas = new int[4];

        System.out.println("Digite os números para a matriz 4x4:");


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }


        for (int j = 0; j < 4; j++) {
            int soma = 0;
            for (int i = 0; i < 4; i++) {
                soma += matriz[i][j];
            }
            somaColunas[j] = soma;
        }

        System.out.println("\nSoma dos elementos de cada coluna:");
        for (int j = 0; j < 4; j++) {
            System.out.println("Coluna " + j + ": " + somaColunas[j]);
        }


    }

}
