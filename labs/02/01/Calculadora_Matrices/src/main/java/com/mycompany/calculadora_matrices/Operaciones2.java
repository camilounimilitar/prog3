/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora_matrices;

/**
 *
 * @author ALEJANDRO
 */
public class Operaciones2 {

    public static int[][] suma(int a, int b[][], int c[][], int d[][]) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                d[i][j] = (b[i][j] + c[i][j]);
            }
        }
        return d;
    }

    public static int[][] producto(int f1, int c1, int f2, int c2, int a[][], int b[][]) {

        int c[][] = new int[f1][c2];

        for (int i = 0; i < f1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int h = 0; h < c1; h++) {

                    c[i][j] = c[i][j] + (a[i][h] * b[h][j]);

                }
            }

        }

        return c;
    }

    public static int[][] escalar(int a, int b, int c[][]) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                c[i][j] = (c[i][j] * b);
            }
        }

        return c;
    }

    public static int[][] traspuesta(int a, int b, int c[][]) {
       
        int d[][] = new int[b][a];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < c[i].length; j++) {
             d[j][i]=c[i][j];
            }
        }

        return d;
    }

}
