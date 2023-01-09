/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author yasmi
 */
public class funcionarios {
    public String nome;
    public String depart;
    public double salario;
    public String data;
    public String rg;
    public float aumento;

    
    public void recebeAumento(double aumento){
        double novoSalario = this.salario + aumento;
        this.salario = novoSalario;
        System.out.println("o novo salario e: "+novoSalario);
    }
    
    public void calculaGanhoAtual(){
        double ganhoAtual = this.salario*12;
        System.out.println("o ganho anual e': "+ganhoAtual);
       
    }
    
    public void status(){
        System.out.println("sobre o funcionario: ");
        System.out.println("o nome e' "+this.nome);
        System.out.println("o rg e'"+this.rg);
        System.out.println("o departamento e' "+this.depart);
        System.out.println("o salario e' "+this.salario);
        
    }

  
    
    
    
}
