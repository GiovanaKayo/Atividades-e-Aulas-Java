package atividades_java2;

import java.util.Scanner;

public class SalariosMinimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salarioMinimo = 1212.00;

        System.out.println("Digite o valor do seu sálario: R$ ");
        double salarioUsuario = entrada.nextDouble();

        double quantidade = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe aproximadamente" + quantidade + "salários.");
    }
}
