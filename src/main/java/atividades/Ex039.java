package atividades;

import java.util.Scanner;

public class Ex039 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        int contador = 0;
        int soma = 0;

        while(contador < 5){
            System.out.println("Digite o " + (contador + 1) + "º número inteiro: ");
            int numero = numeros.nextInt();
            soma += numero;
            contador++;
        }

        double media = (double) soma / 5;
        System.out.println("A média aritmédica dos números digitados é: " + media);

    }
}
