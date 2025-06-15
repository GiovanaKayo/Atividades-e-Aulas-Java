package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMaiores = 0;

        for (int n = 1; n <= 20; n++) {
            System.out.print("Digite a idade da " + n + "ª pessoa: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                contadorMaiores++;
            }
        }

        System.out.println("Quantidade de pessoas maiores de idade: " + contadorMaiores);

    }
}
