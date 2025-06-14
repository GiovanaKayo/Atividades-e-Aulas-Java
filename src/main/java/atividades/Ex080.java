package atividades;

import java.util.Scanner;

public class Ex080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, somaIdades = 0, contador = 0;

        do {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                idade = scanner.nextInt();
                scanner.nextLine(); // limpar buffer

                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double media = (double) somaIdades / contador;
            System.out.println("A média das idades é: " + media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

    }
}

