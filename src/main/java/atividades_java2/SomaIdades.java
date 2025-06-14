package atividades_java2;

import java.util.Scanner;

public class SomaIdades {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int somaIdades = 0;

        System.out.println("Digite a idade de 20 pessoas");

        for (int n = 1; n <= 20; n++){
            System.out.println("Idade da pessoa" + n + ", ");
            int idade = entrada.nextInt();
            somaIdades += idade;
        }

        System.out.println("A soma das idades é: " + somaIdades);


    }

}
