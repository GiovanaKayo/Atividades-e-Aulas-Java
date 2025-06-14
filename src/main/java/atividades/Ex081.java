package atividades;

import java.util.Scanner;

public class Ex081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int n = 0;

        do {
            System.out.print("Digite o número " + (n + 1) + ": ");
            numeros[n] = scanner.nextInt();
            n++;
        } while (n < 5);

        System.out.println("Números na ordem inversa:");

        n = 4;
        do {
            System.out.println(numeros[n]);
            n--;
        } while (n >= 0);

    }
}
