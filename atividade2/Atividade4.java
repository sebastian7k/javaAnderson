package atividade2;

import java.util.Scanner;

public class Atividade4 {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    
        System.out.println();

        System.out.println("Iforme a sua idade");
        int idade=sc.nextInt();

        if (idade>=18){
            System.out.println("Maior de idade");
        }
        else{
            System.out.println("Menor de idade");
        }

    
    sc.close();
}
    
}