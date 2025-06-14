package atividades;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner aumento = new Scanner(System.in);

        System.out.println("Digite o salário atual: ");
        double salario = aumento.nextDouble();
        double novoSalario = salario * 1.15;

        System.out.println("O novo salário com 15% de aumento é: R$ " + novoSalario);
    }
}