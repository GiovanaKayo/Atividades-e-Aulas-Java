package atividades;

import java.util.Scanner;

public class Ex110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] resultado = new int[2][2];


        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("matriz1[" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }


        System.out.println("\nDigite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("matriz2[" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }


        System.out.println(" Resultado da subtração (matriz1 - matriz2):");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(resultado[i][j] + "\t");
            }

        }


    }
}

