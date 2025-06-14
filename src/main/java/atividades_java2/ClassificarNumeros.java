package atividades_java2;

import java.util.Scanner;

public class ClassificarNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int entre0e100 = 0;
        int entre101e200 = 0;
        int maioresQue200 = 0;

        System.out.println("Digite 20 números inteiros:");

        for (int n = 1; n <= 20; n++) {
            System.out.print("Número " + n + ": ");
            int numero = entrada.nextInt();

            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else if (numero > 200) {
                maioresQue200++;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Números entre 0 e 100: " + entre0e100);
        System.out.println("Números entre 101 e 200: " + entre101e200);
        System.out.println("Números maiores que 200: " + maioresQue200);
    }
}

