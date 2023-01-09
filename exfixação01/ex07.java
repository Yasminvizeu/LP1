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
public class ex07 {
    public static void main (String [] args){
        
        float juros, taxa, tempo, capital, prest, valor_imovel;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("entre com o valor do imovel");
        capital = sc.nextFloat();
        
        System.out.println("entre com o a taxa do juros");
        taxa = sc.nextFloat();
        
        System.out.println("entre com o tempo em meses");
        tempo = sc.nextFloat();
        
        juros = capital*taxa/100*tempo;
        prest = (capital+juros)/tempo;
        
        System.out.println("o valor da prestcao e'"+prest);
        
    }
}
