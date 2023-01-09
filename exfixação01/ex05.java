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
public class ex05 {
    public static void main (String [] args){
        
        float aposta;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o valor da aposta: ");
        aposta = sc.nextFloat ();
        
        System.out.printf("o valor da sena e ' %.2f\no valor da quina e' %.2f\n10o valor da quadra e' %.2f", aposta*0.6, aposta*0.3,aposta*0.1);
        
     
        
    }
}
