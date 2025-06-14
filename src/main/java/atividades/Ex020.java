package atividades;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int numero = numeros.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " é par");
        } else {
            System.out.println("O numero " + numero + " é impar");
        }
    }
}