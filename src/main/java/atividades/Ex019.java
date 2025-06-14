package atividades;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);

        int nota1 = aluno.nextInt();
        int nota2 = aluno.nextInt();
        int nota3 = aluno.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }
    }
}