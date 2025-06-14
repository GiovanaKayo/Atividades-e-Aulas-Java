package atividades_Java1;

import java.util.Scanner;

public class CalculoIPI {

    public static void main(String[] args){

        float ipi;
        int codPeca1, codPeca2;
        float valorPeca1, valorPeca2;
        int quantPeca1, quantPeca2;
        float total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI: ");
        ipi = entrada.nextFloat();

        System.out.println("Código da peça 1: ");
        codPeca1 = entrada.nextInt();
        System.out.println("Valor unitário da peça 1: ");
        valorPeca1 = entrada.nextFloat();
        System.out.println("Quantidade da peça 1: ");
        quantPeca1 = entrada.nextInt();

        System.out.println("Código da peça 2: ");
        codPeca2 = entrada.nextInt();
        System.out.println("Valor unitário da peça 2: ");
        valorPeca2 = entrada.nextFloat();
        System.out.println("Quantidade da peça 2: ");
        quantPeca2 = entrada.nextInt();


        total = (valorPeca1 * quantPeca1 + valorPeca2 * quantPeca2) * (ipi / 100 + 1);

        System.out.println("Valor total a ser pago com IPI: " + total);

    }
}
