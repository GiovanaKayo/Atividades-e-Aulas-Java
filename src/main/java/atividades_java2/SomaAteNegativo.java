package atividades_java2;

import java.util.Scanner;

public class SomaAteNegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Número: ");
            numero = entrada.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }
}

