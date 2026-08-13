package atividade;

public class Formatacao3 {
    public static void main(String[] args) {
        double preco = 12.5;

        System.out.printf("Preço: R$ %.2f",preco);

        double media = 8.4567;

        System.out.printf("Média: %.1f%n", media);
        System.out.printf("Média: %.2f%n", media);
        System.out.printf("Média: %.3f%n", media);
    }
    
}
