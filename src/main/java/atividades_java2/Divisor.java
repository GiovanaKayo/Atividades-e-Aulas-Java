package atividades_java2;

import java.util.Scanner;

public class Divisor {
    public static void main(String[] args){

        float n;

        Scanner numero = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        n = numero.nextInt();

        boolean divisivel = false;

        if (n % 10 == 0) {
            System.out.println("O número é divisível por 10.");
            divisivel = true;
        }
        if (n % 5 == 0) {
            System.out.println("O número é divisível por 5.");
            divisivel = true;
        }
        if (n % 2 == 0) {
            System.out.println("O número é divisível por 2.");
            divisivel = true;
        }
        if (!divisivel){
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }

    }
}
