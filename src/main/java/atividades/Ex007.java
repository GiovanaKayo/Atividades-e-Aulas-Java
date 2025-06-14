package atividades;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o sálario base do funcionário: ");
        float salarioBase = salario.nextFloat();

        float comissao = salarioBase * 0.05f;

        float salarioLiquido = salarioBase + comissao;

        System.out.println("Sálario líquido: R$ %.2f" + salarioLiquido);
    }
}
