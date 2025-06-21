package VETORESeMATRIZES;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Digite 7 números inteiros:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / 7.0;
        System.out.println("A média aritmética dos 7 números é: " + media);

    }
}
