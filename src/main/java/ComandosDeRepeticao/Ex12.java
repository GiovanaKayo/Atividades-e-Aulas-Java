package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;

        for (int n = 1; n <= 20; n++) {
            System.out.print("Digite o " + n + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);


    }
}
