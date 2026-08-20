package dowhile;

import java.util.Scanner;

public class Dowh04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String senha ="";

        do{
            System.out.println("Infome sua senhha");
            senha=sc.next();
        }while(!senha.equals("1234"));
        System.out.println("Acesso permitido!");

        
        

        
        
        sc.close();
    }
}
