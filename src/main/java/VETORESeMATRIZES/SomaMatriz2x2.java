package VETORESeMATRIZES;

import java.util.Scanner;

public class SomaMatriz2x2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 2x2:");

        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();
                soma += matriz[linha][coluna];
            }
        }

        System.out.println("Soma de todos os elementos da matriz: " + soma);

    }
}
