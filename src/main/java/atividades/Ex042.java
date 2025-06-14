package atividades;

import java.util.Scanner;

public class Ex042 {
    public static void main(String[] args) {
        Scanner primos = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int numero = primos.nextInt();

        if (numero <= 1){
            System.out.println("Não é um número primo: ");
        }else{
            int i = 2;
            boolean primo = true;

            while (i <= numero / 2){
                if (numero % 1 == 0){
                    primo = false;
                    break;
                }
                i++;
            }
            if(primo){
                System.out.println(numero + " é um número primo.");
            }else{
                System.out.println(numero + " não é um número primo.");
            }
        }

    }
}