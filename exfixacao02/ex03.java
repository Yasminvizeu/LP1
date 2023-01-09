/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfixacao02;

import java.util.Scanner;

/**
 *
 * @author cg3010279
 */
public class ex03 {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("entre com um inteiro positivo de tres digitos: ");
    int num = sc.nextInt();
    
    numInvertido(num);
    
    }
    
    public static void numInvertido(int num){
    
        int num1 = num%10;
        int num2 = num1/10;
        int num3 = num/100;
        
        System.out.printf("%d%d%d\n",num1,num2,num3);
    }
  
}
