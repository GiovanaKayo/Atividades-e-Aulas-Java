package atividades;

import java.util.Scanner;

public class Ex085{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0, pares = 0, numero;

        do {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
            contador++;
        } while (contador < 5);

        System.out.println("Quantidade de números pares: " + pares);

    }
}

