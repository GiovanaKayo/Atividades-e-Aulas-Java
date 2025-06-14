package atividades_java2;

import java.util.Scanner;

public class SomaDeDezNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 10 números inteiros: ");

        for (int n = 1; n <= 10; n++){
            System.out.println("Número " + n + ": ");
            int numero = entrada.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 números é: " + soma);
    }
}
