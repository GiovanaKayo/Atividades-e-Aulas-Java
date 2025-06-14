package atividades;

import java.util.Scanner;

public class Ex040 {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = tabuada.nextInt();
        int i = 0;
        int resultado;

        while(i<10){
            i++;
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}