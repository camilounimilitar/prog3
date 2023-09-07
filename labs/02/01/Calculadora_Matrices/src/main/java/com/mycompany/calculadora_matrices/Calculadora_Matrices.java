/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora_matrices;

import java.util.Scanner;

/**
 *
 * @author ALEJANDRO
 */
public class Calculadora_Matrices {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Operaciones2 op = new Operaciones2();
        int tam;
        int opcion, opcion2;
        int fila1, fila2;
        int col1, col2;
        int num;
        String mens;

        do {
            System.out.println("Elja Una Opcion: \n1.Suma de Matrices \n2.Prodcuto Punto \n3.Matriz por un escalar \n4.Matriz Traspuesta \n5.Salir");
            opcion = in.nextInt();

            switch (opcion) {

                case 1: {
                    System.out.println("ingrese el numero de filas de la matriz");
                    tam = Lectura.cap();

                    int matrizA[][] = new int[tam][tam];
                    int matrizB[][] = new int[tam][tam];
                    int matrizC[][] = new int[tam][tam];
                    int matrizD[][] = new int[tam][tam];

                    /*for (int i = 0; i < tam; i++) {
                        for (int j = 0; j < tam; j++) {

                            System.out.println("Ingrese un numero para la matriz A:");
                            matrizA[i][j] = in.nextInt();

                        }

                    }*/
                    System.out.println("Ingrese los numeros para la matriz A:");
                    matrizA = Lectura.matriz_cuadrada();

                    System.out.println("=================================================");

                    System.out.println("Ingrese los numeros para la matriz B:");
                    matrizB = Lectura.matriz_cuadrada();
                    /*for (int i = 0; i < tam; i++) {
                        for (int j = 0; j < tam; j++) {

                            System.out.println("Ingrese un numero para la matriz B:");
                            matrizB[i][j] = in.nextInt();

                        }

                    }*/

                    matrizC = op.suma(tam, matrizA, matrizB, matrizD);
                    Lectura.escritura(tam, tam, matrizC);

                    /*for (int i = 0; i < tam; i++) {
                        for (int j = 0; j < tam; j++) {

                            System.out.print(matrizC[i][j] + " ");

                        }
                        System.out.print("\n");
                    }*/
                    break;

                }

                case 2: {
                    System.out.println("Ingrese el numero de filas de la primera Matriz");
                    fila1 = Lectura.cap();
                    System.out.println("Ingrese el numero de columnas de la primera Matriz");
                    col1 = Lectura.cap();
                    System.out.println("Ingrese el numero de filas de la segunda Matriz");
                    fila2 = Lectura.cap();
                    System.out.println("Ingrese el numero de columnas de la segunda Matriz");
                    col2 = Lectura.cap();

                    int matrizA[][] = new int[fila1][col1];
                    int matrizB[][] = new int[fila2][col2];
                    int matrizC[][] = new int[fila1][col2];
                    if (col1 == fila2) {
                        System.out.println("Ingrese los numeros para la matriz A:");
                        matrizA = Lectura.matriz_dim(fila1, col1);
                        /*for (int i = 0; i < fila1; i++) {
                            for (int j = 0; j < col1; j++) {

                                System.out.println("Ingrese un numero para la matriz A:");
                                matrizA[i][j] = in.nextInt();

                            }

                        }*/
                        System.out.println("Ingrese los numeros para la matriz B:");
                        matrizB = Lectura.matriz_dim(fila2, col2);
                        /*for (int i = 0; i < fila2; i++) {
                            for (int j = 0; j < col2; j++) {

                                System.out.println("Ingrese un numero para la matriz B:");
                                matrizB[i][j] = in.nextInt();

                            }

                        }*/

                        matrizC = op.producto(fila1, col1, fila2, col2, matrizA, matrizB);
                        Lectura.escritura(fila1, col2, matrizC);
                        /*for (int i = 0; i < fila1; i++) {
                            for (int j = 0; j < col2; j++) {

                                System.out.print(matrizC[i][j] + " ");

                            }
                            System.out.print("\n");
                        }*/

                    } else {
                        System.out.println("Las dimensiones ingresadas no cumplen los criterios del producto punto");
                    }
                    break;

                }

                case 3: {
                    System.out.println("Elija un tamaño de matriz \n1.2X2 \n2.3X3 \n3.4X4 ");
                    opcion2 = Lectura.cap();
                    switch (opcion2) {

                        case 1: {

                            tam = 2;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            /*for (int i = 0; i < tam; i++) {
                                for (int j = 0; j < tam; j++) {
                                    System.out.println("Ingrese un valor para la matriz");
                                    matrizA[i][j] = in.nextInt();
                                }
                            }*/
                            mens="Ingrese un numero por el que multiplicar la matriz";
                            Lectura.imprimir(mens);
                            //System.out.println("Ingrese un numero por el que multiplicar la matriz");
                            num = Lectura.cap();

                            matrizB = Operaciones2.escalar(tam, num, matrizA);
                            /*for (int i = 0; i < tam; i++) {
                                for (int j = 0; j < tam; j++) {
                                    System.out.print(matrizB[i][j] + "\t");

                                }
                                System.out.print("\n");
                            }*/
                            break;

                        }

                        case 2: {
                            tam = 3;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];

                            for (int i = 0; i < tam; i++) {
                                for (int j = 0; j < tam; j++) {
                                    System.out.println("Ingrese un valor para la matriz");
                                    matrizA[i][j] = in.nextInt();

                                }
                            }

                            System.out.println("Ingrese un numero por el que multiplicar la matriz");
                            num = in.nextInt();

                            matrizB = Operaciones2.escalar(tam, num, matrizA);

                            for (int i = 0; i < tam; i++) {
                                for (int j = 0; j < tam; j++) {
                                    System.out.print(matrizB[i][j] + "\t");

                                }
                                System.out.print("\n");
                            }
                            break;

                        }
                        case 3: {
                            tam = 4;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];

                            for (int i = 0; i < tam; i++) {
                                for (int j = 0; j < tam; j++) {
                                    System.out.println("Ingrese un valor para la matriz");
                                    matrizA[i][j] = in.nextInt();

                                }
                            }
                            System.out.println("Ingrese un numero por el que multiplicar la matriz");
                            num = in.nextInt();

                            matrizB = Operaciones2.escalar(tam, num, matrizA);

                            for (int i = 0; i < tam; i++) {
                                for (int j = 0; j < tam; j++) {
                                    System.out.print(matrizB[i][j] + "\t");

                                }
                                System.out.print("\n");
                            }
                            break;
                        }

                    }

                }

                case 4: {

                    System.out.println("Ingrese el numero de filas");
                    fila1 = in.nextInt();
                    System.out.println("Ingrese el numero de columnas ");
                    col1 = in.nextInt();

                    int matrizA[][] = new int[fila1][col1];
                    int matrizB[][] = new int[col1][fila1];

                    for (int i = 0; i < fila1; i++) {
                        for (int j = 0; j < col1; j++) {
                            System.out.println("Ingrese un numero para la matriz ");
                            matrizA[i][j] = in.nextInt();
                        }
                    }
                    matrizB = Operaciones2.traspuesta(fila1, col1, matrizA);

                    for (int i = 0; i < col1; i++) {
                        for (int j = 0; j < fila1; j++) {
                            System.out.print(matrizB[i][j] + "\t");

                        }
                        System.out.print("\n");
                    }
                    break;
                }

            }

        } while (opcion != 5);

    }
}
