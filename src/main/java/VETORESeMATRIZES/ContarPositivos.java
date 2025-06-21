package VETORESeMATRIZES;

import java.util.Scanner;

public class ContarPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePositivos = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                quantidadePositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + quantidadePositivos);

    }
}
