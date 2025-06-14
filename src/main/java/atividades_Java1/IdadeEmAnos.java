package atividades_Java1;

import java.util.Scanner;

public class IdadeEmAnos {

    public static void main(String[] args){

        int anos;
        int meses;
        int dias;
        int totalDias;

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite a idade em anos: ");
        anos = entrada.nextInt();

        System.out.println("Digite a idade em meses: ");
        meses = entrada.nextInt();

        System.out.println("Digite a idade em dias: ");
        dias = entrada.nextInt();

        totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("A idade expressa em dias é: " + totalDias);

    }
}
