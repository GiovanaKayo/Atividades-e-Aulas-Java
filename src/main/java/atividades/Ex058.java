package atividades;

import java.util.Scanner;

public class Ex058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite;

        System.out.print("Digite um número inteiro para limite da sequência de Fibonacci: ");
        limite = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println("Sequência de Fibonacci até " + limite + ":");

        if (limite >= 0) {
            System.out.print(a);
        }

        do {
            System.out.print(" " + b);
            int proximo = a + b;
            a = b;
            b = proximo;
        } while (a + b <= limite);


    }
}
