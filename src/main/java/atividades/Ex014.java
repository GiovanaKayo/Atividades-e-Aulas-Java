package atividades;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int anos = idade.nextInt();

        System.out.println("Digite sua idade em anos: ");
        int meses = idade.nextInt();

        System.out.println("Digite sua idade em anos: ");
        int dias = idade.nextInt();

        int totalDia = (anos * 365) + (meses * 30) + dias;

        System.out.println("Você tem aproximadamente " + totalDia + " dias de vida.");
    }
}