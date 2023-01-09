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
public class ex02 {
    
    public static void main (String[]args){
           
        System.out.println("entre com um numero inteiro: ");
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println("antecessor: "+antecessor(num, 1));
        System.out.println("sucessor: "+sucessor(num,1));    
    }
    public static int antecessor(int num, int num1){
        int aux1 = num-num1;
        return aux1;
    }
     public static int sucessor(int num, int num2){
        int aux2 = num+num2;
        return aux2;
    }
}
