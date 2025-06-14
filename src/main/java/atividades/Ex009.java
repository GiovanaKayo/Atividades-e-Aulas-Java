package atividades;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner poupanca = new Scanner(System.in);

        System.out.println("Digite o valor do depósito mensal: ");
        float depositoMensal = poupanca.nextFloat();

        System.out.println("Digite a taxa de juros mensal em (em%): ");
        float taxaJuros = poupanca.nextFloat();

        float juros = taxaJuros / 100;

        float montante = 0;

        for (int i = 1; i <= 12; i++){
            montante = montante + depositoMensal;
            montante += montante * juros;
        }

        System.out.println("Montante após 12 meses: R$ %.2f\n" + montante);



    }
}
