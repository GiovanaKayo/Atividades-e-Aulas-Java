package VETORESeMATRIZES;

import java.util.Scanner;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        int maior = Integer.MIN_VALUE;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

                if (matriz[linha][coluna] > maior) {
                    maior = matriz[linha][coluna];
                }
            }
        }

        System.out.println("Maior valor presente na matriz: " + maior);

    }
}

