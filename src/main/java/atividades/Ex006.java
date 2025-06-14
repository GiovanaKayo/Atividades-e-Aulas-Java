package atividades;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num = numero.nextInt();

        if (num % 2 == 0){
            System.out.println("o número é par.");
        }else{
            System.out.println("o número é ímpar.");
        }

    }
}
