package atividade3;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- MENU DE MOCHILAS -----");
            System.out.println("1 MOCHILA ESCOLAR");
            System.out.println("2 MOCHILA DE VIAGEM");
            System.out.println("3 MOCHILA ESPORTIVA");
            System.out.println("4 SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n[Mochila Escolar] Compacta e idela para estudantes");
                    break;
                case 2:
                    System.out.println("\n[Mochila de Viagem] Espacçosa ideal para longas jornadas");
                    break;
                case 3:
                    System.out.println("\n[Mochila Esportiva]  Leve, resistente e ergonômica");
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

