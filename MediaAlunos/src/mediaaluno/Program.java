package mediaaluno;


import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = sc.next();
        
        System.out.print("Digite a matricula do aluno: ");
        int matricula = sc.nextInt();
        
        Aluno aluno = new Aluno(nomeAluno, matricula);
        
        System.out.print("Digite a materia em que as provas foram feitas: ");
        String nomeDaMateria = sc.next();
        
        Materia materia = new Materia(nomeDaMateria, aluno);
        
        System.out.print("Digite a nota da prova 1: ");
        double prova1 = sc.nextDouble();
        
        System.out.print("Digite a nota da prova 2: ");
        double prova2 = sc.nextDouble();
        
        double media = (prova1 + prova2) / 2;
        
        materia.setMediaAluno(media);
        
        System.out.println(materia.getInfoMedia());
        
    }

}