package atividades_java2;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsisus: ");
        double celsius = entrada.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}
