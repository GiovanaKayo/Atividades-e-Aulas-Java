package atividades;

import java.util.Scanner;

public class Ex094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 7 números inteiros:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par: " + numero);
            }
        }


    }
}
