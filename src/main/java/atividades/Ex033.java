package atividades;

import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Scanner aluno_turno = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = aluno_turno.nextLine();

        System.out.println("Digite o turno (M para matutino, V para vespertino): ");
        String turno = aluno_turno.nextLine().toUpperCase();

        if(turno == "M"){
            System.out.println("Bom dia, " + nome);
        }
        else if(turno == "V"){
            System.out.println("Boa tarde, " + nome);
        }
        else{
            System.out.println("Turno inválido.");
        }
    }
}