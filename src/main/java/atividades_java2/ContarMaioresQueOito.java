package atividades_java2;

import java.util.Scanner;

public class ContarMaioresQueOito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int n = 1; n <= 20; n++) {
            System.out.print("Número " + n + ": ");
            int numero = entrada.nextInt();

            if (numero > 8) {
                contador++;
            }
        }

        System.out.println("Quantidade de números maiores que 8: " + contador);
    }
}
