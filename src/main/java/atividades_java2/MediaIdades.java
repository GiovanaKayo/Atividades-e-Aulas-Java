package atividades_java2;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);

        int somaIdades = 0;

        System.out.println("Digite a idade de 20 pessoas");

        for (int n = 1; n <= 20; n++){
            System.out.println("Idade da pessoa " + n + ": ");
            int idade = entrada.nextInt();
            somaIdades += idade;
        }

        double media = somaIdades / 20.0;

        System.out.println("A média das idades é: " + media);
    }
}
