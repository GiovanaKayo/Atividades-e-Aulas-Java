package atividades_Java1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args){

        float salarioMinimo, salarioUsuario, quantSalario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        salarioMinimo = entrada.nextFloat();


        System.out.println("Digite o valor do seu salário: ");
        salarioUsuario = entrada.nextFloat();

        quantSalario = salarioUsuario / salarioMinimo;

        System.out.println("Você recebe" + quantSalario + "salários mínimos.");

    }


}
