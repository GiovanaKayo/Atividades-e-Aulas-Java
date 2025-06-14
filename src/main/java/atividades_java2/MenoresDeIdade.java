package atividades_java2;

import java.util.Scanner;

public class MenoresDeIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nomeMaisnovo = "";
        int idadeMaisnovo = 0;


        for (int n = 1; n <= 10; n++){
            System.out.println("Digite o nome da pessoa" + n + ": ");
            String nome = entrada.nextLine();

            System.out.println("Digite a idade de " + nome + ": ");
            int idade = entrada.nextInt();
            entrada.nextLine();

            if (idade < idadeMaisnovo){
                idadeMaisnovo = idade;
                nomeMaisnovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisnovo + "(" + idadeMaisnovo + "anos");

    }
}
