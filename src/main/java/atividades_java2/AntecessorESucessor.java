package atividades_java2;

import java.util.Scanner;

public class AntecessorESucessor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        int antecessor= numero -1;
        int sucecessor = numero +1;

        System.out.println("Número digitado: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucecessor);
    }
}
