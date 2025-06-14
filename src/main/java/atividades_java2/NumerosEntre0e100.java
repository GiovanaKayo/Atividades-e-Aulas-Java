package atividades_java2;

import java.util.Scanner;

public class NumerosEntre0e100 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int n = 1; n <= 20; n++) {
            System.out.print("Número " + n + ": ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100 (inclusive): " + contador);
    }
}
