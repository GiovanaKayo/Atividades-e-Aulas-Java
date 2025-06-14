package atividades;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Scanner genero = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = genero.nextInt();
        genero.nextLine(); // limpa o buffer

        System.out.println("Digite seu sexo (M ou F): ");
        String sexo = genero.nextLine().toUpperCase();

        if ((sexo.equals("M") && idade >= 65) || (sexo.equals("F") && idade >= 60)) {
            System.out.println("Você pode se aposentar.");
        } else {
            System.out.println("Você ainda não pode se aposentar.");
        }

    }
}