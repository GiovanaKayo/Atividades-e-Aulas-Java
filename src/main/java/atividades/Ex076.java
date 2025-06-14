package atividades;

import java.util.Scanner;

public class Ex076 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, n = 1, soma = 0;

        System.out.print("Digite um número inteiro: ");
        numero = scanner.nextInt();

        do {
            if (n % 2 == 0) {
                soma += n;
            }
            n++;
        } while (n <= numero);

        System.out.println("A soma dos números pares entre 1 e " + numero + " é: " + soma);

    }
}
