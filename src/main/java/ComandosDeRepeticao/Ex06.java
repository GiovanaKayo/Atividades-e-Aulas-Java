package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        System.out.println("A soma das idades das 20 pessoas é: " + soma);

    }
}