package atividades_java2;

import java.util.Scanner;

public class SomaComParadaNegativa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite números inteiros para somar. Digite um número negativo para encerrar:");

        do {
            System.out.print("Número: ");
            numero = entrada.nextInt();

            if (numero >= 0) {
                soma += numero;
            }

        } while (numero >= 0);

        System.out.println("A soma dos números digitados é: " + soma);
    }
}

