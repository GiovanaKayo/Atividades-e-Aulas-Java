package atividades;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner entrada_raio = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double raio = entrada_raio.nextFloat();
        double area = 3.14 * Math.pow(raio, 2);
        double perimetro = 2 * 3.14 * raio;

        System.out.println("Sua area é: "+area);
        System.out.println("Seu perimetro é: "+perimetro);
    }
}
