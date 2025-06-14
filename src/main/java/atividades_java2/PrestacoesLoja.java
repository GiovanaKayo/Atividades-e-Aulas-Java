package atividades_java2;

import java.util.Scanner;

public class PrestacoesLoja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor total da compra (R$): ");
        double valorCompra = entrada.nextDouble();

        double valorPrestacao = valorCompra / 5;

        System.out.println("O valor de cada uma das 5 prestações é: R$ " + valorPrestacao);
    }
}
