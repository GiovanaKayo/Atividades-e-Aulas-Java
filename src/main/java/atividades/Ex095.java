package atividades;

import java.util.Scanner;

public class Ex095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {
                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {

                    String temp = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = temp;
                }
            }
        }

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}

