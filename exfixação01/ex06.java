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
public class ex06 {
    public static void main(String [] args){
        
        float total_conta;
        
        Scanner sc = new Scanner (System.in);
        System.out.println("entre com o valor da conta: ");
        total_conta = sc.nextFloat();
        
        System.out.printf("a taxa de servico e' %.2f", total_conta*0.1);
        
        
        
    }
}
