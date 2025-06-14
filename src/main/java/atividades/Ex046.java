package atividades;

import java.util.Scanner;

public class Ex046 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = numeros.nextInt();

        int contador = 1;
        int soma = 0;

        while (contador <= num){
            if (contador % 2 == 0){
                soma += contador;
            }
            contador++;
        }
        System.out.println("A soma de todos os números pares entre 1 e " + num + "é: " + soma);
    }
}
