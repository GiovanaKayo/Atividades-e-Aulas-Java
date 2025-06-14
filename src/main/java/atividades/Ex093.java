package atividades;

import java.util.Scanner;

public class Ex093 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 50) {
                contador++;
            }
        }

        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contador);

    }
}

