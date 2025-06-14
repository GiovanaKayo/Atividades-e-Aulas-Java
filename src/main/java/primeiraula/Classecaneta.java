package primeiraula;

public class Classecaneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){

        if (this.tampada == true){
            System.out.println("Erro!! A caneta está tampada!");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void desenhar(){
        if(this.tampada == true){
            System.out.println("Erro!! A caneta está tampada!");
        }else{
            System.out.println("Estou desenhando");
        }
    }

    void pintar(){
        if(this.tampada == true){
            System.out.println("Erro!! A caneta está tampada!");
        }else{
            System.out.println("Estou pintando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void estado_atual(){
        System.out.println("Esta caneta é do moedelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a ponta: " + this.ponta);
        System.out.println("Esta caneta esta com a carga em: " + this.carga + "%");
        System.out.println("Esta caneta esta tampada?: " + this.tampada);

    }





}
