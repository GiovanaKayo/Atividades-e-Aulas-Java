package atividades;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = numeros.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = numeros.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é múltiplo de " + num2);
        } else {
            System.out.println(num1 + " não é múltiplo de " + num2);
        }
    }
}