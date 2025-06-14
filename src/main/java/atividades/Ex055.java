package atividades;

import java.util.Scanner;

public class Ex055 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, i = 1;

        System.out.print("Digite um número inteiro: ");
        numero = entrada.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);

        entrada.close();
    }
}
