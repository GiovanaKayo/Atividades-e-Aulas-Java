package atividades;

public class Ex060{
    public static void main(String[] args) {
        int a = 0, b = 1;
        int contador = 1;

        System.out.println("Os primeiros 20 números da sequência de Fibonacci:");

        do {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
            contador++;
        } while (contador <= 20);


    }
}

