package atividades;

public class Ex053 {
    public static void main(String[] args) {
        int numero = 1;

        System.out.println("Números pares de 1 a 50: ");

        do{
            if (numero % 2 == 0){
                System.out.println(numero);
            }
            numero++;
        }while (numero <= 50);
    }
}
