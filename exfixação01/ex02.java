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
public class ex02 {
     public static void main(String [] arg){
     float km1, km2, dist, v40, v50, v60, v70, v80;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("digite km da cidade 1: ");
        km1 = sc.nextFloat(); 
        
        System.out.println("digite km da cidade 2: ");
        km2 = sc.nextFloat();
        
        dist = km2 - km1;
       
        v40 = dist/40;
        v50 = dist/50;
        v60 = dist/60;
        v70 = dist/70;
        v80 = dist/80;
        
     
        System.out.println(" em 40 km/hr demora " + v40+ " horas");
        System.out.println(" em 50 km/hr demora " + v50+ " horas");
        System.out.println(" em 60 km/hr demora " + v60+ " horas");
        System.out.println(" em 70 km/hr demora " + v70+ " horas");
        System.out.println(" em 80 km/hr demora " + v80+ " horas");
    }      
    
}

    

