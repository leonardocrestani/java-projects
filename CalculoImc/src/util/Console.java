package util;

import java.util.Scanner;


public class Console {
    
    public static String lerString(String texto) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(texto);
        String opcao = sc.nextLine();
        
        return opcao;
    }
    
    public static double lerDoubleImc(String texto) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(texto);
        double valor = sc.nextDouble();
        
        return valor;
        
    }
    
    public static void mostraMensagem(String mensagem, Boolean quebraLinha) {
        if(quebraLinha) {
            System.out.println(mensagem);
        }
        else {
            System.out.println(mensagem);
        }
    }
    
   
}
