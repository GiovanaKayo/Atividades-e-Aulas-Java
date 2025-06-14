package atividades;

import java.util.Scanner;

public class Ex087 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int contadorPositivos = 0;

            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();

                if (numero > 0) {
                    contadorPositivos++;
                }
            }

            System.out.println("Quantidade de números positivos: " + contadorPositivos);

        }
    }

