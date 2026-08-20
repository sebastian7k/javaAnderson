package dowhile;

import java.util.Scanner;

public class Dowh05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            System.out.println("\nDigite uma opção: ");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Opção 3");
            System.out.println("4 - Opção 4");
            System.out.println("5 - Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Cadastro de clientes");
                    break;
                case 2:
                    System.out.println("Cadastro de produtos");
                    break;
                case 3:
                    System.out.println("Cadastro de funcionários");
                    break;
                case 4:
                    System.out.println("Alteração de cadastro");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 5);
        sc.close();
    }
}