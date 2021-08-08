
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor para Fibonacci: ");
        int fib = sc.nextInt();
        
        System.out.println("Sequencia de Fibonacci");
        for(int i = 0; i<fib; i++) {
            if(i != fib-1) {
                System.out.print(calculoFibonacci(i) + " ");
            }
            else {
                System.out.print(calculoFibonacci(i));
            }
        }
        
        System.out.println("");
            
        sc.close();
    }
    
    public static int calculoFibonacci(int fib) {
        if(fib < 2) {
            return fib;
        }
        else{
            int fibFinal = calculoFibonacci(fib-1) + calculoFibonacci(fib-2);
            return fibFinal;
        }
    }
    
}