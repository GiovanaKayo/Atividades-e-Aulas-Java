package atividades;

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Digite o valor do salário-mínimo: ");
        double salarioMinimo = salario.nextDouble();

        System.out.println("Digite o salário do funcionário: ");
        double salarioFuncionario = salario.nextDouble();

        double quantidadeSalarios = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidadeSalarios + " salários-mínimos");

    }
}