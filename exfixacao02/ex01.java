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
public class ex01 {
    
    public static void main (String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("entre com o valor do kilo do ouro: ");
    float precoKg = sc.nextFloat();
    
    System.out.println("5g: "+preco(precoKg,5));
    System.out.println("10g: "+preco(precoKg,10));
    System.out.println("20g: "+preco(precoKg,20));
        
    }
    
    public static float preco(float precoKg, float num){
    float v_total = (precoKg*num);
    return v_total;
        
    }
}
