package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int n = 1; n <= 20; n++) {
            System.out.print("Digite a idade da " + n + "ª pessoa: ");
            int idade = scanner.nextInt();
            soma += idade;
        }

        double media = soma / 20.0;
        System.out.println("A média das idades das 20 pessoas é: " + media);

    }
}
