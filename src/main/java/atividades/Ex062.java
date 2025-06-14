package atividades;

public class Ex062 {
    public static void main(String[] args) {
        int n = 1;

        System.out.println("Números ímpares de 1 a 50:");

        do {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
            n++;
        } while (n <= 50);


    }
}
