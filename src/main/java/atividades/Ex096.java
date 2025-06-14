package atividades;

import java.util.Scanner;

public class Ex096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os números da matriz 3x3:");


        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Número na posição [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("Aqui está a matriz que você digitou:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print(matriz[linha][coluna] + " ");
            }

        }

    }
}
