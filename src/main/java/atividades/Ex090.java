package atividades;

import java.util.Scanner;

public class Ex090 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean temZero = false;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                temZero = true;
            }
        }

        if (temZero) {
            System.out.println("Pelo menos um dos números digitados é zero.");
        } else {
            System.out.println("Nenhum dos números digitados é zero.");
        }

    }
}
