package atividades;

import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.print("Digite o nome da pessoa " + (contador + 1) + ": ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            contador++;
        } while (contador < 5);

        double media = (double) somaIdades / 5;
        System.out.println("A média das idades é: " + media);


    }
}

