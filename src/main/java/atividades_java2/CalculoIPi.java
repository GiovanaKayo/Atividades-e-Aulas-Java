package atividades_java2;

import java.util.Scanner;

public class CalculoIPi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI (ex: 10 para 10%): ");
        double ipi = entrada.nextDouble();

        System.out.println("Digite o código da peça 1: ");
        int cod1 = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite a quantidade da peça 1: ");
        int quant1 = entrada.nextInt();



        System.out.println("Digite o código da peça 2: ");
        int cod2 = entrada.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        double valor2 = entrada.nextDouble();

        System.out.println("Digite a quantidade da peça 2: ");
        int quant2 = entrada.nextInt();

        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.println("Valo total a ser pago com IPI: R$ " + total);
    }
}
