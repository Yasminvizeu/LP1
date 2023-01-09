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
public class ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("entre com um valor: ");
        int valor1 = sc.nextInt();
        System.out.println("entre com um valor: ");
        int valor2 = sc.nextInt();
        System.out.println("entre com um valor: ");
        int valor3 = sc.nextInt();
        
        verify(valor1,valor2,valor3);
    
    }
    public static void verify(int valor1, int valor2, int valor3){
        if ((valor1<= valor2)&&(valor2<=valor3)) System.out.printf("%d - %d - %d", valor1, valor2, valor3);
        else if ((valor1<= valor3)&&(valor3<=valor2)) System.out.printf("%d - %d - %d", valor1, valor3, valor2);
        else if ((valor2<= valor1)&&(valor1<=valor3)) System.out.printf("%d - %d - %d", valor2, valor1, valor3);
        else if ((valor2<= valor3)&&(valor3<=valor1)) System.out.printf("%d - %d - %d", valor2, valor3, valor1);
        else if ((valor3<= valor1)&&(valor1<=valor2)) System.out.printf("%d - %d - %d", valor3, valor1, valor2);
        else/*((valor3<= valor2)&&(valor2<=valor1))*/ System.out.printf("%d - %d - %d", valor3, valor2, valor1);
        
    }
}

