package VETORESeMATRIZES;

import java.util.Scanner;

public class MediaMatriz4x4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 4 * 4;

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int linha = 0; linha < 4; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
                soma += matriz[linha][coluna];
            }
        }

        double media = (double) soma / totalElementos;
        System.out.printf("Média aritmética dos elementos da matriz: %.2f", media);

    }
}

