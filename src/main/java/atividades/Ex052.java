package atividades;

public class Ex052 {
    public static void main(String[] args) {
        int numero = 1;
        int soma = 0;

        do{
            soma = soma + numero;
            numero = numero + 1;
        }while (numero <= 100);

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
