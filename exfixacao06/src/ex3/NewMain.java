/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author yasmi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        conta c1 = new conta();
        conta yasmin = new conta();

        
        c1.numConta=(1234);
        c1.saldo=(1000f);
        
        c1.extrato();
        c1.depostio(10);
        c1.saque(10);
        
        
        yasmin.numConta=(1233);
        yasmin.saldo=(90);
      
        yasmin.extrato();
        yasmin.depostio(10f);
        yasmin.saque(10);
        
        
                
                
                }
}
               
    

