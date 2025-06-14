package atividades_java2;


public class SomaDeUmAQuinze {
    public static void main(String[] args) {
        int soma = 0;

        for (int n = 1; n <= 15; n++){
            soma += n;
        }

        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}
