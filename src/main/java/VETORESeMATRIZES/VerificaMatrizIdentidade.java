package VETORESeMATRIZES;

import java.util.Scanner;

public class VerificaMatrizIdentidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean identidade = true;

        for (int i = 0; i < 3 && identidade; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                    break;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                    break;
                }
            }
        }

        if (identidade) {
            System.out.println("A matriz é uma matriz identidade.");
        } else {
            System.out.println("A matriz não é uma matriz identidade.");
        }

    }
}

