package atividades;

import java.util.Scanner;

public class Ex041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int divisor = 2;

        System.out.println("Divisores de " + numero + ":");
        while(divisor <= numero){
            if(numero % divisor == 0){
                System.out.println(divisor);
            }
            divisor = divisor + 1;
        }
    }
}