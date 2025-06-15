package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisNovo = "";
        int menorIdade = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = Integer.parseInt(scanner.nextLine());

            if (idade < menorIdade) {
                menorIdade = idade;
                nomeMaisNovo = nome;
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo + " com " + menorIdade + " anos.");

    }

}
