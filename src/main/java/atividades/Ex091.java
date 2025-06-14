package atividades;

import java.util.Scanner;

public class Ex091 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int somaPositivos = 0;
    int somaNegativos = 0;

    for (int i = 1; i <= 10; i++) {
        System.out.print("Digite o número " + i + ": ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            somaPositivos += numero;
        } else if (numero < 0) {
            somaNegativos += numero;
        }
    }

    System.out.println("Soma dos números positivos: " + somaPositivos);
    System.out.println("Soma dos números negativos: " + somaNegativos);

}
}
