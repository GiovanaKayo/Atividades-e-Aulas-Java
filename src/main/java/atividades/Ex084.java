package atividades;

import java.util.Scanner;

public class Ex084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, i = 0, numero;

        do {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numero = scanner.nextInt();
            soma += numero;
            i++;
        } while (i < 7);

        double media = (double) soma / 7;
        System.out.println("A média aritmética dos números é: " + media);

    }
}

