package atividades;

import java.util.Scanner;

public class Ex021 {
    public static void main(String[] args) {
        int i;
        Scanner idades = new Scanner(System.in);
        int quantidade = idades.nextInt();
        int menores = 0;
        int maiores = 0;



        for (i = 0; i < quantidade; i++) {
            System.out.println("Digite a idade da pessoa " + (i+1) + ":");
            int idade = idades.nextInt();

            if(idade < 18){
                menores++;
            }
            else{
                maiores++;
            }
        }

        System.out.println("Menores de idade: " + menores);
        System.out.println("Maiores de idade: " + maiores);
    }
}