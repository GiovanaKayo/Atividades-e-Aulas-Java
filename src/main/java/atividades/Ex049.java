package atividades;

import java.util.Scanner;

public class Ex049 {
    public static void main(String[] args) {
        Scanner fato = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = fato.nextInt();

        int fatorial = 1;
        int contador = numero;

        while (contador > 1) {
            fatorial = fatorial * contador;
            contador++;
        }

        System.out.println("O fatorial de " + numero + "é: " + fatorial );
    }

}
