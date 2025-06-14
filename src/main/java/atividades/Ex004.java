package atividades;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);

        System.out.println("Digte a primeira nota (peso 2): ");
        float nota1 = nota.nextFloat();

        System.out.println("Digite a segunda nota (peso 3): ");
        float nota2 = nota.nextFloat();

        System.out.println("Digite a terceira nota (peso 5): ");
        float nota3 = nota.nextFloat();

        float media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / (2 + 3 +5);

        System.out.println("A média ponderada é: " + media);
    }
}
