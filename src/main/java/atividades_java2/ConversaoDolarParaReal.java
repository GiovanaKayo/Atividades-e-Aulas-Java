package atividades_java2;

import java.util.Scanner;

public class ConversaoDolarParaReal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a cotação do dólar: ");
        double cotacaoDolar = entrada.nextDouble();

        System.out.println("Digite a quantidade de dólares (US$): ");
        double quantidadeDolares = entrada.nextDouble();

        double valorEmReais = cotacaoDolar * quantidadeDolares;

        System.out.println("Valor equivalente em reais: R$: " + valorEmReais);
    }
}
