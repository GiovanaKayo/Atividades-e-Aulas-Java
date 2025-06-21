package VETORESeMATRIZES;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class OrdenarDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("Números em ordem decrescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

    }
}
