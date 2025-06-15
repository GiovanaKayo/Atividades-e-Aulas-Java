package ComandosDeRepeticao;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int n = 1; n <= 10; n++) {
            int resultado = numero * n;
            System.out.println(numero + " x " + n + " = " + resultado);
        }

    }

}
