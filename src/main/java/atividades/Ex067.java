package atividades;

public class Ex067 {
    public static void main(String[] args) {
        int n = 1;
        int soma = 0;

        do {
            soma += n;
            n++;
        } while (n <= 100);

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

