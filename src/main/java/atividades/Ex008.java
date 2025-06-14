package atividades;

import java.util.Scanner;

public class Ex008 {

    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        float numero1 = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        float numero2 = scanner.nextInt();


        System.out.println("Antes da troca: ");
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        System.out.println("Depois da troca: ");
        System.out.println("Número 1: " + numero2);
        System.out.println("Número 2: " + numero1);
    }
}
