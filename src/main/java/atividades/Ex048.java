package atividades;

import java.util.Scanner;

public class Ex048 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = numeros.nextInt();

        if(numero < 0){
            numero = -numero;
        }
        System.out.println("Dígitos (do fim para o começo: )");

        while (numero > 0){
            int digito = numero % 10;
            System.out.println(digito);
            numero = numero / 10;
        }
    }
}
