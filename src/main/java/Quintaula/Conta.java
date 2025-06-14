package Quintaula;

import java.util.Scanner;
import java.util.Random;

public class Conta {
    Scanner scanner = new Scanner(System.in);
    int numero_conta;
    String titular_conta;
    double saldo_conta;

    public Conta(String nome_titular, double saldo_inicial) {
        this.titular_conta = nome_titular;
        this.saldo_conta = saldo_inicial;

        Random gerador_num = new Random();
        numero_conta = gerador_num.nextInt(1000);
    }

    public void VerSaldo() {
        System.out.println("O número da conta é: " + numero_conta);
        System.out.println("O titular da conta é: " + titular_conta);
        System.out.println("O saldo da conta é: R$" + saldo_conta);
    }

    public void Saque(double valor_saque) {
        if (saldo_conta >= valor_saque) {
            saldo_conta = -valor_saque;
            System.out.println("Saldo atual da conta: R$" + saldo_conta);
            System.out.println("Retirado da conta: R$" + valor_saque);
        } else {
            System.out.println("Seu saldo é insuficiente");
        }
    }

    public void Deposito(double valor_deposito) {
        if (valor_deposito <= 0) {
            System.out.println("Valor do depósito é menor que R$1,00");
        } else {
            saldo_conta = saldo_conta + valor_deposito;
            System.out.print("Seu depósito foi efetuado! Saldo atual da conta: R$" + saldo_conta);
        }
    }

    public void ExibirMenu() {
        System.out.println("Bem vindo ao banco XYZ");
        System.out.println("Escolha sua opção: ");
        System.out.println("1- Ver Saldo");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
        System.out.println("4- Solicitar Empréstimo");
        System.out.println("5- Finalizar Sessão");
    }

    public void Iniciar() {
        int opcao;
        do {
            ExibirMenu();
            opcao = scanner.nextInt();
            Escolher_funcao(opcao);
        }
        while (opcao != 4);
    }

    public void Escolher_funcao(int opcao) {
        double saque;
        double deposito;
        double emprestimo;

        switch (opcao) {
            case 1:
                VerSaldo();
                break;

            case 2:
                System.out.println("Digite o valor do seu saque: R$");
                saque = scanner.nextDouble();
                Saque(saque);
                break;

            case 3:
                System.out.println("Digite o valor do seu deposito: R$");
                deposito = scanner.nextDouble();
                Deposito(deposito);
                break;

            case 4:
                if (saldo_conta < 100) {
                    System.out.println("Digite o valor do empréstimo (até R$1000): ");
                    emprestimo = scanner.nextDouble();
                    if (emprestimo <= 1000) {
                        saldo_conta += emprestimo;
                        System.out.println("Empréstimo aprovado! Novo saldo: R$" + saldo_conta);
                    } else {
                        System.out.println("Valor de empréstimo excede o limite permitido de R$1000.");
                    }
                } else {
                    System.out.println("Seu saldo é maior que R$100. Você não pode solicitar empréstimo.");
                }
                break;

            case 5:
                System.out.println("Operação finalizada!");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}