package atividades;

import java.util.Scanner;

public class Ex064 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        long fatorial = 1;
        int n;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido! Fatorial não é definido para números negativos.");
        } else {
            n = 1;
            do {
                fatorial *= n;
                n++;
            } while (n <= numero);

            System.out.println("Fatorial de " + numero + " é: " + fatorial);
        }

    }
}

