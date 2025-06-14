package atividades;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);

        System.out.println("Digite o valor sa base: ");
        float  base = area.nextFloat();

        System.out.println("Digite o valor da altura: ");
        float altura = area.nextFloat();

        float areaCalculada = base * altura / 2;

        System.out.println("O valor da área é: " + areaCalculada) ;
    }
}
