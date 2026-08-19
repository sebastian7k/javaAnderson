import java.util.Scanner;

public class Cond05 {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua senha");
        String senha= sc.nextLine();

        if(nome.equals("Delane")&& senha.equals("1234")){
            System.out.println("Login realizado com sucesso!");            
        }else if(nome.equals("Maia")&& senha.equals("1234")){
            System.out.println("Login realizado com sucesso");
        }else{
            System.out.println("Nome ou senha incorretos");
        }

        sc.close();
    }
}
