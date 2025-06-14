package atividades;

public class Ex047 {
    public static void main(String[] args) {
        int numero = 1;

        System.out.println("Número ímpares de 1 a 50: ");

        while(numero <= 50){
            if(numero % 2 != 0){
                System.out.println(numero);
            }
            numero++;
        }

    }
}
