/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra24;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] fibonacci;
        int num;
       
        System.out.println("Cuantos números desea que tenga la secuencia de Fibonacci?");
        num = input.nextInt();
        fibonacci = new int[num];
        
        num = 1;
        for(int i = 0; i <= fibonacci.length - 1; i++){
            if(i <= 1){
                fibonacci[i] = num;
            }else{
                num = fibonacci[i - 1] + fibonacci[i - 2];
                fibonacci[i] = num;
            }
        }
        System.out.println("La secuencia de Fibonacci de " + fibonacci.length + " numeros es: ");
        mostrarFibonacci(fibonacci);
        
        System.out.println("");
    }
    
    private static void mostrarFibonacci(int []fib){
        for(int i = 0; i <= fib.length - 1; i++){
            System.out.print(fib[i] + " ");
        }
    }
    
}
