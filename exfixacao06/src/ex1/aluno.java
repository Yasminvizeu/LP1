/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1;

/**
 *
 * @author yasmi
 */
public class aluno {

    int matricula;
    String nome;
    double p1, p2, trab;
    double media;
    

    double Media(double p1, double p2, double trab) {
        this.p1 = p1;
        this.p2 = p2;
        this.trab = trab;
        this.media = ((p1 * 2.5) + (p2 * 2.5) + (trab * 2)) / 7;

        return media;

    }

    double Final() {
        double f;
        if (media < 6) {
             f = 6-media;     
        }
        else{
            return 0;
        }
        
      return f;

        

}
}