package vetores;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int CAPACIDADE_MAX = 5;
        String[] nomes = new String[CAPACIDADE_MAX];
        int[] quantidades = new int[CAPACIDADE_MAX];
        int qtd = 0;

        int opcao = 0;

        do {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1: 
                    if (qtd >= CAPACIDADE_MAX) {
                        System.out.println("\n[erro] Limite maximo de " + CAPACIDADE_MAX + " produtos atingido");
                    } else {
                        System.out.println("Digite o nome do produto: ");
                        nomes[qtd] = sc.nextLine();
                        System.out.println("Digite a quantidade em estoque: ");
                        quantidades[qtd] = sc.nextInt();
                        sc.nextLine();
                        qtd++;
                        System.out.println("\nProduto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado");
                    } else {
                        System.out.println("\nProdutos cadastrados: ");
                        for (int i = 0; i < qtd; i++) {
                            System.out.println("Produto: " + i + " - Nome: " + nomes[i] + ", Quantidade: " + quantidades[i]);
                        }
                    }
                    break;

                case 3:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado");
                    } else {
                        System.out.println("Digite o nome do produto que deseja pesquisar: ");
                        String busca = sc.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(busca)) {
                                System.out.println("\n---Produto encontrado---: ");
                                System.out.println("Índice: " + i + ", Nome: " + nomes[i] + ", Quantidade: " + quantidades[i]);
                                encontrado = true;
                                break;
                            }
                        }
                        if (!encontrado) {
                            System.out.println("\nProduto não encontrado.");
                        }
                    }
                    break;

                case 4:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado");
                    } else {
                        System.out.println("Digite o nome do produto que deseja alterar: ");
                        String busca = sc.nextLine();
                        int posAlterar = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(busca)) {
                                posAlterar = i;
                                break;
                            }
                        }
                        if (posAlterar != -1) {
                            System.out.println("Digite o novo nome do produto: ");
                            nomes[posAlterar] = sc.nextLine();

                            System.out.println("Digite a nova quantidade em estoque: ");
                            quantidades[posAlterar] = sc.nextInt();
                            sc.nextLine();
                            System.out.println("\nProduto alterado com sucesso!");
                        } else {
                            System.out.println("\nProduto não encontrado.");
                        }
                    }
                    break;

                case 5:
                    if (qtd == 0) {
                        System.out.println("\nNenhum produto cadastrado para remover. ");
                    } else {
                        System.out.println("Digite o nome do produto que deseja remover: ");
                        String buscaRemover = sc.nextLine();
                        int posRemover = -1;

                        for (int i = 0; i < qtd; i++) {
                            if (nomes[i].equalsIgnoreCase(buscaRemover)) {
                                posRemover = i;
                                break;
                            }
                        }
                        if (posRemover != -1) {
                            for (int i = posRemover; i < qtd - 1; i++) {
                                nomes[i] = nomes[i + 1];
                                quantidades[i] = quantidades[i + 1];
                            }
                            nomes[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;
                            qtd--;
                            System.out.println("\nProduto removido com sucesso!");
                        } else {
                            System.out.println("\nProduto não encontrado.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("\nSaindo do programa...");
                    break;

                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        sc.close();
    }
}