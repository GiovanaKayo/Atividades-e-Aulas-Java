package atividades_java2;

import java.util.Scanner;

public class NumerosDescendente {
    public static void main(String[] args) {
        Scanner descendente = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = descendente.nextInt();

        System.out.println("Digite o valor de B: ");
        int b = descendente.nextInt();

        System.out.println("Digite o valor de C: ");
        int c = descendente.nextInt();

        int maior, medio, menor;

        if (a >= b && a >= c){
            maior = a;
            medio = Math.max(b, c);
            menor = Math.min(b, c);
        }else if (b >= a && b >= c){
            maior = b;
            medio = Math.max(a, c);
            menor = Math.min(a, c);
        }else{
            maior = c;
            medio = Math.max(a, b);
            menor = Math.min(a, b);
        }
        System.out.println("Valores em ordem decrescente: " + maior + ", " + medio + ", " + menor);
    }

}
