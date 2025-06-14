package atividades;

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        int n = Math.abs(numero);

        System.out.println("Dígitos do número " + numero + ":");

        if (n == 0) {
            System.out.println(0);
        } else {
            int[] digitos = new int[10];
            int i = 0;

            do {
                digitos[i] = n % 10;
                n /= 10;
                i++;
            } while (n > 0);

            for (int j = i - 1; j >= 0; j--) {
                System.out.println(digitos[j]);
            }
        }
    }
}

