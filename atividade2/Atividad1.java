package atividade2;

import java.util.Scanner;

public class Atividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:  ");
        int numero =sc.nextInt();

        if(numero>0){
            System.out.printf("%s Numero positivo",numero);
        }else if(numero<0){
            System.out.printf("%s Numero negativo",numero);
        }else{
            System.out.printf("%s Numero nulo",numero);
        }

        sc.close();
    }
    
}
