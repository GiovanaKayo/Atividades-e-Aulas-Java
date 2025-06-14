package atividades_java2;

import java.util.Scanner;

public class MaioresDeIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contadorMaiores = 0;

        System.out.println("Digite a idade de 20 pessoas: ");

        for (int n = 1; n <= 20; n++){
            System.out.println("Idade das pessoas " + n + ": ");
            int idade = entrada.nextInt();

            if (idade >= 18){
                contadorMaiores++;
            }
        }

        System.out.println("Quantidade de pessoas maiores de idade: "+ contadorMaiores);
    }
}
