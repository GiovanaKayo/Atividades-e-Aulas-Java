package atividades_java2;

import java.util.Scanner;

public class ReajusteSaldo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o saldo atual: R$ ");
        double saldo = entrada.nextDouble();

        double saldoReajustado = saldo * 1.015;

        System.out.println("Saldo com reajuste de 1,5% R$" + saldoReajustado);
    }
}
