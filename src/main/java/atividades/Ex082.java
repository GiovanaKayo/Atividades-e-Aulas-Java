package atividades;

import java.util.Scanner;

public class Ex082 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, i = 0, numero;

        do {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            soma += numero;
            i++;
        } while (i < 10);

        System.out.println("A soma dos 10 números é: " + soma);

    }
}

