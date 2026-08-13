package atividade;
import java.util.Scanner;
public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println();
        System.out.printf("Nome do Cliente:  ");
        String cliente = sc.nextLine(); 

        System.out.printf("Nome do produto:  ");
        String produto = sc.nextLine();

        System.out.printf("Quantidade: "  );
        int quantidade = sc.nextInt();

        System.out.printf("Válor unitario:  ");
        double valor = sc.nextDouble();

      double total = quantidade * valor;

        System.out.println();
        System.out.println("-------NOTA FISCAL-------");
        System.out.printf("Cliente: %s%n" ,cliente);
        System.out.printf("Produto: %s%n " ,produto);
        System.out.printf("Quantidade: %d%n" ,quantidade);
        System.out.printf("Valor Unitario: %.2f%n" ,valor);
        System.out.printf("Total: %.2f%n" ,total);

        System.out.println("-------------------------");
            sc.close();
    }
    
}