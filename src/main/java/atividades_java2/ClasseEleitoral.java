package atividades_java2;

import java.util.Scanner;

public class ClasseEleitoral {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a idade: ");
        int idade = entrada.nextInt();

        if (idade < 16){
            System.out.println("Classe eleitoral: não eleitor");
        }else if ((idade >= 16 && idade < 18) || idade >= 65){
            System.out.println("Classe eleitoral: Facultativo");
        }else{
            System.out.println("Classe eleitoral: Obrigátoria");
        }
    }
}
