package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(nome);
        }
    }
}
