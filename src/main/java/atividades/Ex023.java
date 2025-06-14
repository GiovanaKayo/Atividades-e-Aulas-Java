package atividades;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Scanner meses = new Scanner(System.in);

        System.out.println("Digite o nome de um mês: ");
        String mes = meses.nextLine();

        mes = mes.toLowerCase();
        String dias;

        switch (mes) {
            case "janeiro": dias = "31"; break;
            case "março": dias = "31"; break;
            case "maio": dias = "31"; break;
            case "julho": dias = "31"; break;
            case "agosto": dias = "31"; break;
            case "outubro": dias = "31"; break;
            case "dezembro": dias = "31"; break;

            case "abril": dias = "30"; break;
            case "junho": dias = "30"; break;
            case "setembro": dias = "30"; break;
            case "novembro": dias = "30"; break;

            case "fevereiro": dias = "28"; break;

            default: dias = "Mês inválido!"; break;
        }

        System.out.println("O mês de " + mes + " tem " + dias + " dias.");
    }
}