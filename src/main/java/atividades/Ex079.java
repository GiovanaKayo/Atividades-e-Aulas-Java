package atividades;

import java.util.Scanner;

public class Ex079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, i;
        long fatorial = 1;

        System.out.print("Digite um número inteiro não negativo: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não está definido para números negativos.");
        } else {
            i = 1;
            do {
                fatorial *= i;
                i++;
            } while (i <= numero);

            System.out.println("Fatorial de " + numero + " = " + fatorial);
        }

    }
}
