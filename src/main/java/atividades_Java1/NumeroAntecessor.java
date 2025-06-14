package atividades_Java1;

import java.util.Scanner;

public class NumeroAntecessor {
    public static void main(String[] args){

        int num, antecessor, sucessor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        num = entrada.nextInt();

        antecessor = num -1;
        sucessor = num + 2;

        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
    }
}
