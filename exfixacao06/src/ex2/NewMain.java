/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author yasmi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        funcionarios f1 = new funcionarios();

        f1.data = ("25.09");
        f1.depart = ("RH");
        f1.nome = ("Yasmin Vizeu Gil");
        f1.rg = ("50.810.993-0");
        f1.aumento = (10.1f);
        f1.salario = (1500);

        f1.status();
        f1.recebeAumento(100);
        f1.calculaGanhoAtual();

    }

}
