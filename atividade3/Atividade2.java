package atividade3;

import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- MENU DE EMBALAGENS -----");
            System.out.println("1 CAIXA DE PAPELÃO");
            System.out.println("2 SACOLA PLASTICA");
            System.out.println("3 EMBALAGEM DE VIDRO");
            System.out.println("4 SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n[Caixa de papelão] Ideal para transporte e e-commerce");
                    break;
                case 2:
                    System.out.println("\n[Sacola Plastica] Leve e impermeável ótima para compras de mercado");
                    break;
                case 3:
                    System.out.println("\n[Embalagem de Vidro] Ideal para o armazenamento de alimentos");
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4);

        sc.close();
    }
}