package atividades_java2;

import java.util.Scanner;

public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do vendedor: ");
        String nome = entrada.nextLine();

        System.out.println("Insira o salário fixo: R$ ");
        double salarioFixo = entrada.nextDouble();

        System.out.println("Informe o total de vendas no mês: R$ ");
        double totalVendas = entrada.nextDouble();

        double comissao = totalVendas * 0.5;
        double salariofinal = salarioFixo + comissao;

        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final com comissão: R$ " + salariofinal);

    }
}
