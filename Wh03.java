import java.util.Scanner;

public class Wh03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Informe o primeiro número: ");
        int limite = sc.nextInt();
        int num1 = 1;


        while (num1<=limite) {
            System.out.println(num1);
            num1++;
        }
        
        
        
        sc.close();
    }
}
