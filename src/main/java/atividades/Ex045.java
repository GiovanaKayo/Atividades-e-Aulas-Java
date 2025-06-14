package atividades;

public class Ex045 {
    public static void main(String[] args) {
        int contador = 0;
        int a = 0;
        int b = 1;

        System.out.println("Os primeiros 20 números da sequência de fibonacci: ");

        while (contador < 20){
            System.out.println(a + " ");

            int proximo = a + b;
            a = b;
            b = proximo;

            contador ++;
        }
    }
}
