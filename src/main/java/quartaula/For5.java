package quartaula;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {

        int contador, n1, par = 0, impar = 0;


        Scanner numeros = new Scanner(System.in);

        for(n1 = 1; n1 <= 10; n1++){
            System.out.println("Insira com o " + n1 + "o. Número: ");

            contador = numeros.nextInt();

            if(contador %2 == 0){
                par += 1;
            }else{
                impar +=1;
            }

        }
        System.out.println("Você tem " + par + "números pares " + impar + "números impares!");

    }
}
