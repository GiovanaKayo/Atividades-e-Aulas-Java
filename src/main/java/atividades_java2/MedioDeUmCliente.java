package atividades_java2;

import java.util.Scanner;

public class MedioDeUmCliente {
    public static void main(String[] args) {
        Scanner cliente = new Scanner(System.in);

        System.out.println("Digite o saldo médio do cliente: R$ ");
        double saldoMedio = cliente.nextDouble();

        double credito = 0;

        if(saldoMedio <= 500){
            credito = 0;
        }else if (saldoMedio <=1000){
            credito = saldoMedio * 0.30;
        }else if (saldoMedio <= 3000){
            credito = saldoMedio * 0.40;
        }else{
            credito = saldoMedio * 0.50;
        }

        System.out.println("Saldo médico: R$ " + saldoMedio);
        System.out.println("Crédito concedido: R$ " + credito);
    }
}
