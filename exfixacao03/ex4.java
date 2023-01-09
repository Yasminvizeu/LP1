/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfixacao3;

import java.util.Scanner;

/**
 *
 * @author cg3010279
 */
public class ex4 {
    public static void main(String[]args){
      
    Scanner sc = new Scanner(System.in);
        float media;
  
        System.out.println("entre com as notas p1, trabe lab: ");
        float p1 = sc.nextFloat ();
        float trab= sc.nextFloat ();
        float lab = sc.nextFloat ();
        
        media = ((p1*5)+(trab*2)+(lab*3))/10;
        
        situacaoAluno(media);
        
        System.out.println(media);
        
    }
    public static void situacaoAluno(float media){
        if ((media>=0)&&(media<4)) System.out.println("REPROVADO");
        if ((media>=4)&&(media<7)) System.out.println("EXAME FINAL");
        if ((media>=7)&&(media<=10)) System.out.println("APROVADO");
        
       

    }
    
}
