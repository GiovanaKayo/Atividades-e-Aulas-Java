package atividades;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner verifique = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = verifique.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    }
}