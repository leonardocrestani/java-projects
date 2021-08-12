package util;

import java.util.Scanner;


public class Console {
    // Metodos de input e output no console
    
    /**
     * Ex de comentario colocar /** espaco e enter
     * Este metodo vai mostrar o texto para o usuario e indicar o que o usuario deve informar para o programa
     * Neste exemplo uma string
     * @param texto
     * @return 
     */
    public static String lerString(String texto) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(texto);
        String lido = sc.nextLine();
        
        return lido;
        
    }
    
    /**
     * Este metodo vai mostrar o texto para o usuario e indicar
     * o que o usuario deve informar para o programa neste exemplo um numero
     * @param texto
     * @return 
     */
    public static int lerNumero(String texto) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print(texto);
        int lido = sc.nextInt();
        
        return lido;
    }
    
    /**
     * Mostrar uma mensagem ao usuario
     * @param mensagem
     * @param quebraLinha 
     */
    public static void mostrarMensagem(String mensagem, Boolean quebraLinha) {
        if(quebraLinha) {
            System.out.println(mensagem);
        }
        else {
            System.out.print(mensagem);
        }
    }
    
}
