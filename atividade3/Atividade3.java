package atividade3;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n----- MENU DE CANETAS -----");
            System.out.println("1 CANETAS ESFEROGRAFICAS");
            System.out.println("2 CANETA GEL");
            System.out.println("3 CANETA TINTEIRO");
            System.out.println("4 SAIR");
            System.out.println("ESCOLHA UMA OPÇÃO: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n[Cneta Esferografica] Econômica e de longa duração");
                    break;
                case 2:
                    System.out.println("\n[Caneta Gel] Tinta mais pigmentada e escrita suave ");
                    break;
                case 3:
                    System.out.println("\n[Caneta Tinteiro] Clássica e elegante, usada para cligrafia");
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

