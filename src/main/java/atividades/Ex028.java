package atividades;

import java.util.Scanner;

public class Ex028 {
    public static void main(String[] args) {
        Scanner massa_corporal = new Scanner(System.in);

        System.out.println("Digite seu peso (kg): ");
        double peso = massa_corporal.nextDouble();

        System.out.println("Digite sua altura (ex: 1,70): ");
        double altura = massa_corporal.nextDouble();

        double imc = peso / (altura * altura);
        String classificacao;

        if(imc < 18.5){
            classificacao = "Abaixo do peso";
        }
        else if(imc < 24.9){
            classificacao = "Peso normal";
        }
        else if(imc < 29.9){
            classificacao = "Sobrepeso";
        }
        else if(imc < 34.9){
            classificacao = "Obesidade grau 1";
        }
        else if(imc < 39.9){
            classificacao = "Obesidade grau 2";
        }
        else{
            classificacao = "Obesidade grau 3";
        }
        System.out.println("Seu IMC é " + imc + " e você é " + classificacao);

    }
}
