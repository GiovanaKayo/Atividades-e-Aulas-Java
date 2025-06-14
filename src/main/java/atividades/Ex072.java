package atividades;

import java.util.Scanner;

public class Ex072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, n = 2;
        boolean ehPrimo = true;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            do {
                if (numero % n == 0) {
                    ehPrimo = false;
                }
                n++;
            } while (n <= Math.sqrt(numero) && ehPrimo);
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

    }
}
