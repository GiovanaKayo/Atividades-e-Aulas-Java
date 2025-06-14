package atividades;

import java.util.Scanner;

public class Ex043 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int limite = numeros.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Sequência de Fibonacci até " + limite + ":");

        while (a <= limite){
            System.out.println(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
