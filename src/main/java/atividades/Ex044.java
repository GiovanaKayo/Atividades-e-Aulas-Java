package atividades;

import java.util.Scanner;

public class Ex044 {
    public static void main(String[] args) {
        Scanner idades = new Scanner(System.in);

        int contador = 0;
        int somaIdades = 0;

        while (contador < 5){
            System.out.println("Digite o nome da" + (contador + 1) + "a pessoa: ");
            String nome = idades.nextLine();


            System.out.println("Digite a idade de " + nome + ": ");
            int idade = idades.nextInt();
            idades.nextLine();

            somaIdades += idade;
            contador++;

            double media = (double) somaIdades / 5;
            System.out.println("A média das idades é: " + media);
        }

    }
}
