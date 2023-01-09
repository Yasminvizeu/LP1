/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3;

/**
 *
 * @author yasmi
 */
public class conta {
    int numConta;
    float saldo;
  
    
    public void extrato(){
        System.out.println("\no numero da conta e': "+this.numConta);
        System.out.println("o saldo e': "+this.saldo);

    }
    public void saque(float saque){
        float novoSaldo= this.saldo-saque;
        System.out.printf("\nsaque: %f\nsaldo atual e': %f \n",saque, novoSaldo);
    }
    public void depostio(float deposito){
        float novoSaldo=this.saldo+deposito;
        System.out.printf("\ndeposito: %f\nsaldo atual e': %f \n",deposito, novoSaldo);
    }
    
}
