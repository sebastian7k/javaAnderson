package atividade2;

import java.util.Scanner;

public class Atividad5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        final String SENHA_CORRETA = "acesso2026";

        System.out.println("Digite a senha de acesso: ");
        String senha = sc.nextLine();

        if(senha.equals(SENHA_CORRETA)){
            System.out.println("Porta Aberta");
        }else{
            System.out.println("ACESSO NEGADO");
        }

        sc.close();
    }
}
