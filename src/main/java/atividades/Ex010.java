package atividades;

import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner entrada_numero = new Scanner(System.in);
        System.out.println("Digite seu número para ver a tabuada até o 10: ");
        int numero = entrada_numero.nextInt();
        int i;
        int resultado;

        for (i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}