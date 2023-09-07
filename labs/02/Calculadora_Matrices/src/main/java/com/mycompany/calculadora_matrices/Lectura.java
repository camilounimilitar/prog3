/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_matrices;

import java.util.Scanner;

/**
 *
 * @author ALEJANDRO
 */
public class Lectura {

    static int tam1;

    static Scanner in = new Scanner(System.in);

    public static int cap() {

        tam1 = in.nextInt();
        return tam1;
    }

    public static int[][] matriz_cuadrada() {

        int matrizA1[][] = new int[tam1][tam1];

        for (int i = 0; i < tam1; i++) {
            for (int j = 0; j < tam1; j++) {

                System.out.println("Ingrese un numero para la matriz :");
                matrizA1[i][j] = in.nextInt();

            }

        }

        return matrizA1;
    }

    public static int[][] matriz_dim(int a, int b) {
        int matrizB1[][] = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.println("Ingrese un numero para la matriz :");
                matrizB1[i][j] = in.nextInt();

            }

        }

        return matrizB1;
    }
    
    public static void escritura(int a,int b, int c[][]){
        
        //int matrizC1[][] =new int[a][b];
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {

                System.out.println(c[i][j]);
                

            }

        }
        
    }

}
