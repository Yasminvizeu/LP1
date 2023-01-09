/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exfixacao3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author cg3010279
 */
public class ex6 {

    public static void main(String[] args) {
        int jogador, maquina = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("JOKENPO!\n ecolha\n[1]pedra\n[2]papel\n[3]tesoura");
        jogador = sc.nextInt();

        switch (jogador) {
            case 1 ->
                System.out.printf("voce escolheu pedra!");
            case 2 ->
                System.out.printf("voce escolheu papel!");
            case 3 ->
                System.out.printf("voce escolheu tesoura!");
        }

        maquina = rand(maquina);

        switch (maquina) {
            case 1 ->
                System.out.printf("\nmaquina escolheu pedra!");
            case 2 ->
                System.out.printf("\nmaquina escolheu papel!");
            case 3 ->
                System.out.printf("\nmaquina escolheu tesoura!");
        }
        jokenpo(jogador, maquina);

    }

    public static int rand(int maquina) {
        Random rd = new Random();
        maquina = rd.nextInt(3) + 1;
        return maquina;
    }

    public static void jokenpo(int jogador, int maquina) {
        System.out.println("\nJOKENPO!");

        if ((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) {
            System.out.println("JOGADOR VENCEU");
        } else if (jogador == maquina) {
            System.out.println("EMPATE");
        } else {
            System.out.println("MAQUINA VENCEU");
        }

    }

}


