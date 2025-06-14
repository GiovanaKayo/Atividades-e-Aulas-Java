package atividades_java2;

import java.util.Scanner;

public class QuantidadeCalorias {
    public static void main(String[] args){

        int Prato;
        int Sobremesa;
        int Bebida;
        int Caloria = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual prato você deseja? 1-Vegetariano, 2-Peixe, 3-Frango e 4-Carne: ");
        Prato = entrada.nextInt();

        System.out.println("Qual sobremesa você deseja? 1-Abacaxi, 2-Sorvete diet, 3-Mousse diet, 4-Mousse chocolate");
        Sobremesa = entrada.nextInt();

        System.out.println("Qual Bebida você deseja? 1-Chá, 2-Suco de Laranja, 3-Suco de melão, 4-Refrigerant diet");
        Bebida= entrada.nextInt();

        switch(Prato) {
            case 1: Caloria += 180; break;
            case 2: Caloria += 230; break;
            case 3: Caloria += 250; break;
            case 4: Caloria += 350; break;
            default: System.out.println("Prato inválido");
        }
        switch (Sobremesa){
            case 1: Caloria += 75; break;
            case 2: Caloria += 110; break;
            case 3: Caloria += 170; break;
            case 4: Caloria += 200; break;
            default: System.out.println("Sobremesa inválida");
        }
        switch (Bebida){
            case 1: Caloria += 20; break;
            case 2: Caloria += 70; break;
            case 3: Caloria += 100; break;
            case 4: Caloria += 65; break;
            default: System.out.println("Bebida inválida");
        }
        System.out.println("Esta refeição contém: " + Caloria + "cal");
    }
}
