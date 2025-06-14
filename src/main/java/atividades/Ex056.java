package atividades;

import java.util.Scanner;

public class Ex056 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro positivo: ");
            numero = entrada.nextInt();
        } while (numero <= 0);

        System.out.println("Divisores de " + numero + ":");

        int n = 1;
        do {
            if (numero % n == 0) {
                System.out.println(n);
            }
            n++;
        } while (n <= numero);

        entrada.close();
    }
}

