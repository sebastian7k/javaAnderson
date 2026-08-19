import java.util.Scanner;

public class Cond03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        System.out.println(" Estudadante ? Digite 1 para SIM 2 para NÂO:  ");
        int estudante=sc.nextInt();

        if(idade>=60 || estudante==11){
            System.out.println("Você tem direito a desconto. ");
        }else{
            System.out.println("Você não tem direito a desconto.");
        }

        sc.close();
    }
}
