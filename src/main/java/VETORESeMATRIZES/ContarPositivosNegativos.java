package VETORESeMATRIZES;

import java.util.Scanner;

public class ContarPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdPositivos = 0;
        int qtdNegativos = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                qtdPositivos++;
            } else if (numero < 0) {
                qtdNegativos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + qtdPositivos);
        System.out.println("Quantidade de números negativos: " + qtdNegativos);

    }
}

