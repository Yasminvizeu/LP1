/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fixação;

import java.util.Scanner;

/**
 *
 * @author cg3010279
 */
public class ex01 {
    public static void main(String[] args) {
        float f, c;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite of valor em Fahrenheit: ");
        f = sc.nextFloat();
        
        c = (f - 32) * 5/9; //d usado para identificar que o valor é double
        
        System.out.println("o valor em celcius e " + c);
        
        
        
        
    }
}
