package segundaula;

import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args){

        float numero1;
        float numero2;
        float soma;
        float subtracao;
        float divisao;
        float multiplicacao;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();

        System.out.println("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();



        subtracao = numero1 - numero2;
        soma = numero1 + numero2;
        divisao = numero1 / numero2;
        multiplicacao = numero1 * numero2;

        System.out.println("O resultado da soma de dois números é: " + soma);
        System.out.println("O resultado da subtração de dois números é: " + subtracao);
        System.out.println("O resultado da divisão de dois números é: " + divisao);
        System.out.println("O resultado da multiplicação de dois números é: " + multiplicacao);

    }
}
