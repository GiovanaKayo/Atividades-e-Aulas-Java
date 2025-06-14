package atividades;

public class Ex068 {
    public static void main(String[] args) {
        int n = 1;

        System.out.println("Números pares de 1 a 50:");

        do {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        } while (n <= 50);


    }
}

