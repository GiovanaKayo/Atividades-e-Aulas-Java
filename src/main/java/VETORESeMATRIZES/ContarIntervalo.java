package VETORESeMATRIZES;

import java.util.Scanner;

public class ContarIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 50) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 10 e 50: " + contador);

    }
}

