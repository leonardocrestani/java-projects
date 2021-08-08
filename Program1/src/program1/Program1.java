
package program1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.next();
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        mostraDados(nome, idade);
        
        sc.close();
        
    }
    
    public static void mostraDados(String nome, int idade){
        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e você tem " + idade + " anos");
    }
    
}
