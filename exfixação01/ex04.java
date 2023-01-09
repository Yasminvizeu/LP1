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
public class ex04 {

    public static void main(String [] args) {
        
        float ipi,v_unit1, v_unit2, valor;
        int cod1, cod2, qnt1, qnt2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o IPI: ");
        ipi = sc.nextFloat();
        
        System.out.println("Digite o codigo do produto 1: ");
        cod1 = sc.nextInt();
      
        System.out.println("Digite o valor unitario 1: ");
        v_unit1 = sc.nextFloat();
        
        System.out.println("Digite a quantidade de produtos 1: ");
        qnt1 = sc.nextInt();
        
        System.out.println("Digite o codigo do produto 2: ");
        cod2 = sc.nextInt();
      
        System.out.println("Digite o valor unitario 2: ");
        v_unit2 = sc.nextFloat();
        
        System.out.println("Digite a quantidade de produtos 2: ");
        qnt2 = sc.nextInt();
       
        valor = (v_unit1*qnt1 + v_unit2*qnt2)*(ipi/100+1);
                
        System.out.println("o valor total e': "+valor);
    
}
    
    
    
}
