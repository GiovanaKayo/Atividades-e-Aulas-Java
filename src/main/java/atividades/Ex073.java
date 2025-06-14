package atividades;

import java.util.Scanner;

public class Ex073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int limite = scanner.nextInt();

        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        do {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        } while (a <= limite);
    }
}

