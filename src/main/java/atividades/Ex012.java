package atividades;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner massa_corporal = new Scanner(System.in);
        System.out.println("Digite seu peso em kg: ");
        double peso = massa_corporal.nextDouble();
        System.out.println("Digite sua altura em metros (ex: 1,70): ");
        double altura = massa_corporal.nextDouble();

        double imc = peso/(altura*altura);

        System.out.println("seu IMC é: "+imc);
    }
}
