/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfixacao3;

import java.util.Scanner;

/**
 *
 * @author cg3010279
 */
public class ex5 {
    public static void main(String[]args){
    
    float valor1, valor2;
    char op;
    
    Scanner sc = new Scanner(System.in);
        System.out.println("entre com dois valores: ");
        valor1 = sc.nextFloat();
        valor2 = sc.nextFloat();
        
        System.out.println("operacoes: [+]  [-]  [*]  [/]");
        System.out.println("escolha a operacao: ");
        op = sc.next().charAt(0);
        
        switch (op){
            case '+' -> System.out.printf("%.1f + %.1f = %.1f", valor1, valor2, soma(valor1, valor2));
            case '-' -> System.out.printf("%.1f - %.1f = %.1f", valor1, valor2, subtracao(valor1, valor2));
            case '*' -> System.out.printf("%.1f * %.1f = %.1f", valor1, valor2, multiplicacao(valor1, valor2));
            case '/' -> System.out.printf("%.1f / %.1f = %.1f", valor1, valor2, divisao(valor1, valor2));
        }
    }
        
       public static float soma(float valor1, float valor2){
           float vSoma = valor1 + valor2;
           return vSoma;
       }
       public static float subtracao (float valor1, float valor2){
           float vSub = valor1-valor2;
           return vSub;
       }
       public static float multiplicacao (float valor1, float valor2){
           float vMulti = valor1+valor2;
           return vMulti;
       }
       public static float divisao (float valor1, float valor2){
           float vDiv = valor1+valor2;
           return vDiv;
       }




        
                
        
    
    
}
