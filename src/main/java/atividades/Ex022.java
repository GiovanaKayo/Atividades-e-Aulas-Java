package atividades;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner funcionario = new Scanner(System.in);
        double bonus;

        System.out.println("Digite o salário do funcionário: ");
        float salario = funcionario.nextFloat();

        bonus = salario > 2000 ? salario * 0.10 : salario * 0.05;

        System.out.println("O bônus do funcionário é: R$ " + bonus);
    }
}