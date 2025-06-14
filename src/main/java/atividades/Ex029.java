package atividades;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Scanner disciplina = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = disciplina.nextLine();

        System.out.println("Digite a nota do aluno: ");
        double nota = disciplina.nextDouble();

        if (nota >= 7) {
            System.out.println(nome + " está aprovado");
        } else {
            System.out.println(nome + " está de recuperação");
        }
    }
}