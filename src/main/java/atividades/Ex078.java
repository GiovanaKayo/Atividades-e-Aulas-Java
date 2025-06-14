package atividades;

import java.util.Scanner;

public class Ex078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número negativo detectado. Convertendo para positivo.");
            numero = Math.abs(numero);
        }

        String numeroStr = Integer.toString(numero);
        int i = 0;

        System.out.println("Dígitos separados:");

        do {
            System.out.println(numeroStr.charAt(i));
            i++;
        } while (i < numeroStr.length());

    }
}
