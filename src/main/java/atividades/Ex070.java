package atividades;

import java.util.Scanner;

public class Ex070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, n = 1;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        do {
            System.out.println(numero + " x " + n + " = " + (numero * n));
            n++;
        } while (n <= 10);

    }
}

