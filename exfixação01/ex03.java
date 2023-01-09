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
public class ex03 {
    public static void main(String [] arg){
        
        int idade, dia, mes, ano;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade em anos");
        ano = sc.nextInt();
        
        System.out.println("Digite sua idade em meses");
        mes = sc.nextInt();
        
        System.out.println("Digite sua idade em dias");
        dia = sc.nextInt();
        
        idade = (ano*365)+(mes*30)+(dia);
        
        System.out.println("sua idade em dias e: "+idade+"dias");
        

        
        
    }
    
}
