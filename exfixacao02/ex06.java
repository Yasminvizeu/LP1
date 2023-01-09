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
public class ex06 {
    public static void main (String[]args){
        float altura, peso;
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("entre com o seu peso: ");
        peso = sc.nextFloat();
        System.out.println("entre com a sual altura: ");
        altura = sc.nextFloat();
        
        imc(peso, altura); 
        tabela();
        
    }
    public static void imc(float peso, float altura){
    float imc = peso / (altura*altura);
    System.out.printf("IMC:%.1f\n", imc);

    }
    
    public static void tabela(){
        System.out.println("Condicao        Mulheres             Homens"); 
        System.out.println("-----------------------------------------------");
        System.out.println("abaixo do peso    < 19.1             <20.7");
        System.out.println("peso normal        19.1 - 25.8      20.7 - 26.4");
        System.out.println("acima do peso      25.8 - 32.3      26.4 - 31.1");
        System.out.println("obeso             > 32.3              > 31.1");
        System.out.println("-----------------------------------------------");
        
        
    }
}
