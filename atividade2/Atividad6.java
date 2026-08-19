package atividade2;

import java.util.Scanner;

public class Atividad6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char operador = sc.next().charAt(0);


        double result = 0;

        switch (operador){
            case '+':
                result = num1 + num2;
                System.out.println("Resustado");
                break;
            case '-':
                result = num1 + num2;
                System.out.println("Resustado");
                break;
            case '*':
                result = num1 + num2;
                System.out.println("Resustado");
                break;
            case '/':
            if (num2 !=0){
                    result = num1 / num2;
                    System.out.println(result);
                }else{
                    System.out.println("Erro na divisão");
                }
                break;

                
        }


        sc.close();
    }
}
