package primeiraula;

public class Caneta {
    public static void main(String[]args){

        Classecaneta caneta1 = new Classecaneta();
        caneta1.modelo = "esferográfica";
        caneta1.cor = "preta";
        caneta1.ponta = 0.5f;
        caneta1.carga = 70;
        caneta1.tampada = true;



        Classecaneta caneta2 = new Classecaneta();
        caneta2.modelo = "em gel";
        caneta2.cor = "roxa com glitter";
        caneta2.ponta = 0.2f;
        caneta2.carga = 50;
        caneta2.tampada = true;

        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.estado_atual();

        caneta2.destampar();
        caneta2.pintar();
        caneta2.estado_atual();

    }

}
