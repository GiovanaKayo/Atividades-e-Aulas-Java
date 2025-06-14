package atividades;

import java.util.Scanner;

public class Ex025 {
    public static void main(String[] args) {
        Scanner alunos = new Scanner(System.in);

        System.out.println("Digite o número de faltas do aluno: ");
        int faltas = alunos.nextInt();

        if (faltas > 15) {
            System.out.println("Aluno reprovado por falta.");
        } else {
            System.out.println("Aluno aprovado.");
        }
    }
}