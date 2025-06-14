package atividades;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        float numero1;
        float numero2;
        float soma;
        float subtracao;
        float divisao;
        float multi;

        Scanner entrada = new Scanner(System.in); // instanciando a classe

        System.out.println("Entre com o primeiro numero: ");
        numero1 = entrada.nextFloat(); // se for string = nextLine()

        System.out.println("Entre com o segundo numero: ");
        numero2 = entrada.nextFloat();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        divisao = numero1 / numero2;
        multi = numero1 * numero2;
        System.out.println("O resultado da soma dos dois números é: " + soma);
        System.out.println("O resultado da subtracao dos dois números é: " + subtracao);
        System.out.println("O resultado da divisao dos dois números é: " + divisao);
        System.out.println("O resultado da multiplicacao dos dois números é: " + multi);
    }
}