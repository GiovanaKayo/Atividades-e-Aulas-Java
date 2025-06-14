package atividades;

import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int num1 = numeros.nextInt();
        int num2 = numeros.nextInt();


        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}