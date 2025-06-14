package atividades;

import java.util.Scanner;

public class Ex069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int soma = 0;

        do {
            System.out.print("Digite o número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < 5);

        double media = (double) soma / 5;
        System.out.println("A média dos números digitados é: " + media);

    }
}
