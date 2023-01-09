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
public class ex04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com um valor inteiro ou real");
        float v1 = sc.nextFloat();
        System.out.println("entre com outro valor inteiro ou real");
        float v2 = sc.nextFloat();

        System.out.printf("\n%.1f + %.1f = %.1f\n", v1, v2, soma(v1, v2));
        System.out.printf("%.1f - %.1f = %.1f\n", v1, v2, subtracao(v1, v2));
        System.out.printf("%.1f * %.1f = %.1f\n", v1, v2, multiplicacao(v1, v2));
        System.out.printf("%.1f / %.1f = %.1f\n", v1, v2, divisao(v1, v2));
    }

    public static float soma(float v1, float v2) {
        float vsoma = v1 + v2;
        return vsoma;
    }

    public static float subtracao(float v1, float v2) {
        float vsubtracao = v1 - v2;
        return vsubtracao;

    }

    public static float multiplicacao(float v1, float v2) {
        float vmultiplicacao = v1 * v2;
        return vmultiplicacao;

    }

    public static float divisao(float v1, float v2) {
        float vdivisao = v1 / v2;
        return vdivisao;

    }

}
