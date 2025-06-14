package atividades;

import java.util.Scanner;

public class Ex071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int n = 1;

        System.out.print("Digite um número inteiro positivo: ");
        numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            System.out.println("Divisores de " + numero + ":");

            do {
                if (numero % n == 0) {
                    System.out.println(n);
                }
                n++;
            } while (n <= numero);
        }

    }
}

