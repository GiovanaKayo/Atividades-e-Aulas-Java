package VETORESeMATRIZES;

import java.util.Scanner;

public class SomaColunasMatriz4x4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }

        System.out.println("Soma dos elementos de cada coluna:");

        for (int coluna = 0; coluna < 4; coluna++) {
            int somaColuna = 0;
            for (int linha = 0; linha < 4; linha++) {
                somaColuna += matriz[linha][coluna];
            }
            System.out.println("Coluna " + coluna + ": " + somaColuna);
        }

    }
}
