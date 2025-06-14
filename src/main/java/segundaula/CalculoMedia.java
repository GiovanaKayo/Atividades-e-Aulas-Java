package segundaula;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args){

        float nota1, nota2, nota3, nota4;
        float media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira: ");
        nota1 = entrada.nextFloat();

        System.out.println("Entre com a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Entre com a terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.println("Entre com a quarta nota: ");
        nota4= entrada.nextFloat();


        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("O resultado da média é: " + media);

        if (media >=6){
            System.out.println("Aluno esta aprovado! ;)");
        }else if (media >=5){
            System.out.println("Aluno esta de recuperação! :/");
        } else{
            System.out.println("Aluno esta reprovado! :'(");
        }
    }
}
