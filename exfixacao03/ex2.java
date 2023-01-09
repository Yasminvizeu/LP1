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
public class ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com valor x: ");
        float x = sc.nextFloat();
        System.out.println("entre com valor y: ");
        float y = sc.nextFloat();
        System.out.println("entre com valor z: ");
        float z = sc.nextFloat();
        
        if ((x<y+z)&&(y<x+z)&&(z<x+y)){
          
            triangulo(x,y,z); 
            
          
        }
        else System.out.println("NAO E´UM TRIANGULO");
        
    }

    public static void triangulo(float x, float y, float z) {
        

        if ((x == y)&&(x == z)) System.out.println("triangulo equilatero");
        else if ((x == y)&&(x != z)) System.out.println("triangulo isoceles");  
        else if ((x != y)&&(x == z)) System.out.println("triangulo isoceles");
        if ((x != y)&&(x != z))System.out.println("triangulo escaleno");

      
    }
    }

    
    


    

