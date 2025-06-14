package atividades;

public class Ex077 {
    public static void main(String[] args) {
        int i = 50;

        System.out.println("Números ímpares de 50 a 1:");

        do {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i--;
        } while (i >= 1);

    }
}

