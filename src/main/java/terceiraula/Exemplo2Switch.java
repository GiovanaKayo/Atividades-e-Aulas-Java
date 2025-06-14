package terceiraula;

import java.util.Scanner;

public class Exemplo2Switch {
    public static void main(String[] args) {
        int NumMes = 3;
        String NomeMes;

        Scanner numero = new Scanner(System.in);

        System.out.println("Entrar com número do mês: ");

        NumMes = numero.nextInt();

        switch(NumMes){
            case 1: NomeMes = "Janeiro"; break;
            case 2: NomeMes = "fevereiro"; break;
            case 3: NomeMes = "Março"; break;
            case 4: NomeMes = "Abril"; break;
            case 5: NomeMes = "Maio"; break;
            case 6: NomeMes  = "Junho"; break;
            case 7: NomeMes  = "Julho"; break;
            case 8: NomeMes  = "Agosto"; break;
            case 9: NomeMes  = "Setembro"; break;
            case 10: NomeMes = "Outubro"; break;
            case 11: NomeMes  = "Novembro"; break;
            case 12: NomeMes  = "Dezembro"; break;
            default: NomeMes  = "Dia inválido";
        }

        System.out.println("O dia da semana escolhido foi: " + NumMes);
    }
}
