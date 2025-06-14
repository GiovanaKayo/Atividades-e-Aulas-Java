package atividades;

import java.util.Scanner;

public class Ex088 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int contPares = 0;
        int somaImpares = 0;
        int contImpares = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                contPares++;
            } else {
                somaImpares += numero;
                contImpares++;
            }
        }

        if (contPares > 0) {
            double mediaPares = (double) somaPares / contPares;
            System.out.println("Média dos números pares: " + mediaPares);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        if (contImpares > 0) {
            double mediaImpares = (double) somaImpares / contImpares;
            System.out.println("Média dos números ímpares: " + mediaImpares);
        } else {
            System.out.println("Nenhum número ímpar foi digitado.");
        }

    }
}
