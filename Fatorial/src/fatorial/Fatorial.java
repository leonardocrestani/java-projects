
package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o número que deseja saber o fatorial: ");
        int fat = sc.nextInt();
        
        System.out.println("O fatorial de " + fat + " é: " + calculaFatorial(fat));
        
        sc.close();
    }
    
    public static int calculaFatorial(int fat){
        if(fat < 2){
            return fat;
        }
        else {
            return calculaFatorial(fat-1) * fat;
        }
    }
    
}
