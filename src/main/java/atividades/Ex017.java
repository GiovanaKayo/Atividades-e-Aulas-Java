package atividades;

import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner faixa_etaria = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = faixa_etaria.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente.");
        } else if (idade < 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }
    }
}
