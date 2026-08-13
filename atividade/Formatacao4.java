package atividade;
public class Formatacao4 {
    public static void main(String[] args) {
        String aluno = "Mariana";
        int idade = 17; 
        double nota = 8.75;
    
        System.out.printf(
            "Aluno: %s | idade: %d | Nota: %.2f",
            aluno, idade, nota
        );
    }
}
