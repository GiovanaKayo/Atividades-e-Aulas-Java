package atividades;

import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int n = 2;
        boolean ehPrimo = true;

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            do {
                if (numero % n == 0) {
                    ehPrimo = false;
                }
                n++;
            } while (ehPrimo && n <= Math.sqrt(numero));
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

    }
}

