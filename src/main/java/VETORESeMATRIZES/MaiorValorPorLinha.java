package VETORESeMATRIZES;

import java.util.Scanner;

public class MaiorValorPorLinha {
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

        for (int linha = 0; linha < 4; linha++) {
            int maior = matriz[linha][0];
            for (int coluna = 1; coluna < 4; coluna++) {
                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
            }
            System.out.println("Maior valor da linha " + linha + ": " + maior);
        }

    }
}
