package VETORESeMATRIZES;

import java.util.Scanner;

public class VerificarZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrouZero = false;

        System.out.println("Digite 5 números inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                encontrouZero = true;
                break;
            }
        }

        if (encontrouZero) {
            System.out.println("\nExiste pelo menos um número igual a zero.");
        } else {
            System.out.println("\nNenhum número digitado é igual a zero.");
        }

    }
}
