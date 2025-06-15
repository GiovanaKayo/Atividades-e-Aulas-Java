package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int n = 1; n <= 10; n++) {
            System.out.print("Digite o " + n + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 números é: " + soma);
    }
}