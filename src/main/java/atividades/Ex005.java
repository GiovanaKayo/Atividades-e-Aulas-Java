package atividades;

import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner desconto = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        float preco = desconto.nextFloat();

        System.out.println("Digite a quantidade comprada: ");
        int quantidade = desconto.nextInt();

        float total = preco * quantidade;

        if(quantidade > 10){
            total = total * 0.9f;
        }

        System.out.println("O valor total a pagar: R$ " + total);

    }
}
