package atividades_java2;

public class MediaDasMedias {
    public static void main(String[] args) {
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;

        double somaMedias = media1 + media2;
        double mediaDasMedias = somaMedias / 2.0;

        System.out.println("Média de 8, 9, e 7 " + media1);
        System.out.println("Média de 4, 5, e 6 " + media2);
        System.out.println("Soma das médias " + somaMedias);
        System.out.println("Média das médias " + mediaDasMedias);
    }
}
