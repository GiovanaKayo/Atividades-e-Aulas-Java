package atividades;

public class Ex037 {
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;

        while(num <= 100){
            soma = soma + num;
            num = num + 1;
        }
        System.out.println(soma);
    }
}