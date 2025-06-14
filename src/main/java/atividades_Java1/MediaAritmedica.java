package atividades_Java1;

import java.util.Scanner;

public class MediaAritmedica {

    public static void main(String[] args){

        float media1, media2, somaDaMedias, mediaDasMedias;

        Scanner entrada = new Scanner(System.in);


        media1 = (8 + 9 + 7) / 3f;

        media2 = (4 + 5 + 6) / 3f;

        somaDaMedias = media1 + media2;

        mediaDasMedias = somaDaMedias / 2;


        System.out.println("Média dos números 8, 9 e 7 é: " + media1);
        System.out.println("Média dos números 4, 5 e 6 é: " + media2);
        System.out.println("A soma das médias é: " + somaDaMedias);
        System.out.println("A média das médias é: " + mediaDasMedias);
    }
}
