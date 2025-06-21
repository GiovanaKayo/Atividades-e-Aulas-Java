package VETORESeMATRIZES;

import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonal = 0;

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.print("Elemento [" + linha + "][" + coluna + "]: ");
                matriz[linha][coluna] = scanner.nextInt();

                if (linha == coluna) {
                    somaDiagonal += matriz[linha][coluna];
                }
            }
        }

        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonal);

    }
}
