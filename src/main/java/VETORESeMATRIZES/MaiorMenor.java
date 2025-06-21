package VETORESeMATRIZES;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior, menor;

        System.out.print("Digite o 1º número: ");
        int numero = scanner.nextInt();
        maior = numero;
        menor = numero;

        for (int i = 2; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

    }
}
