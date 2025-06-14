package atividades_Java1;

import java.util.Scanner;

public class ReajusteSaldo {

    public static void main(String[] args){

        float saldo, novoSaldo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o saldo: ");
        saldo = entrada.nextFloat();

        novoSaldo = saldo * 1.01f;

        System.out.println("Saldo com reajuste: " + novoSaldo);


    }
}
