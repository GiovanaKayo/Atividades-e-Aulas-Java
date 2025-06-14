package atividades;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner aritmetica = new Scanner(System.in);

        double num1 = aritmetica.nextFloat();
        System.out.println("Digite seu primeiro numero: ");
        double num2 = aritmetica.nextFloat();
        System.out.println("Digite seu segundo numero: ");
        double num3 = aritmetica.nextFloat();
        System.out.println("Digite seu terceiro numero: ");

        double media = (num1+num2+num3)/3;

        System.out.println("A média aritmética é: "+media);
    }
}
