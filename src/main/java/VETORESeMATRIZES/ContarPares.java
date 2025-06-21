package VETORESeMATRIZES;

import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePares = 0;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);

    }
}
