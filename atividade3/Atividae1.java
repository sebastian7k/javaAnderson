package atividade3;

import java.util.Scanner;

public class Atividae1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int senha;

        do{
            System.out.println("Digite a sua senha");
            senha = sc.nextInt();

            if (senha != 2024){
            System.out.println("Senha errada");
            }

        }while(senha!= 2024);
        System.out.println("Acesso permitido");
        
        
        sc.close();
    }
}
