package atividades;

import java.util.Scanner;

public class Ex054 {
    public static void main(String[] args) {
        Scanner inteiros = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        do{
            System.out.println("Digite o " + (contador + 1) + "º número: ");
            int numero = inteiros.nextInt();
            soma += numero;
            contador++;
        }while (contador < 5);

        double media = (double) soma / 5;

        System.out.println("A média dos 5 números é: " + media);
    }

}
