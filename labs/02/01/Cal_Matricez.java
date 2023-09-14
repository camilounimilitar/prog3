/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ALEJANDRO
 */
public class Cal_Matricez {

   public static void main(String[] args) {

      
        Operaciones2 op = new Operaciones2();
        int tam;
        int opcion, opcion2;
        int fila1, fila2;
        int col1, col2;
        int num;
        do {
            System.out.println("Elja Una Opcion: \n1.Suma de Matrices \n2.Prodcuto Punto \n3.Matriz por un escalar \n4.Matriz Traspuesta \n5.Salir");
            opcion = Lectura.cap();
            switch (opcion) {
                case 1: {
                    Lectura.imprimir("Ingrese el numero de filas de la matriz");
                    tam = Lectura.cap();
                    int matrizA[][] = new int[tam][tam];
                    int matrizB[][] = new int[tam][tam];
                    int matrizC[][] = new int[tam][tam];
                    int matrizD[][] = new int[tam][tam];
                    Lectura.imprimir("Ingrese los numeros para la matriz A:");
                    matrizA = Lectura.matriz_cuadrada();
                    Lectura.imprimir("=====================================================");
                    Lectura.imprimir("Ingrese los numeros para la matriz B:");
                    matrizB = Lectura.matriz_cuadrada();
                    matrizC = op.suma(tam, matrizA, matrizB, matrizD);
                    Lectura.escritura(tam, tam, matrizC);
                    break;
                }
                case 2: {
                    Lectura.imprimir("Ingrese el numero de filas de la primera Matriz");
                    fila1 = Lectura.cap();
                    Lectura.imprimir("Ingrese el numero de columnas de la primera Matriz");
                    col1 = Lectura.cap();
                    Lectura.imprimir("Ingrese el numero de filas de la segunda Matriz");
                    fila2 = Lectura.cap();
                    Lectura.imprimir("Ingrese el numero de columnas de la segunda Matriz");
                    col2 = Lectura.cap();
                    int matrizA[][] = new int[fila1][col1];
                    int matrizB[][] = new int[fila2][col2];
                    int matrizC[][] = new int[fila1][col2];
                    if (col1 == fila2) {
                        Lectura.imprimir("Ingrese los numeros para la matriz A:");
                        matrizA = Lectura.matriz_dim(fila1, col1);
                        Lectura.imprimir("Ingrese los numeros para la matriz B:");
                        matrizB = Lectura.matriz_dim(fila2, col2);
                        matrizC = op.producto(fila1, col1, fila2, col2, matrizA, matrizB);
                        Lectura.escritura(fila1, col2, matrizC);
                    } else {
                        Lectura.imprimir("Las dimensiones ingresadas no cumplen los criterios del producto punto");
                    }
                    break;
                }
                case 3: {
                    Lectura.imprimir("Elija un tamaño de matriz \n1.2X2 \n2.3X3 \n3.4X4 ");
                    opcion2 = Lectura.cap();
                    switch (opcion2) {
                        case 1: {
                            tam = 2;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            matrizA = Lectura.matriz_dim(tam, tam);
                            Lectura.imprimir("Ingrese un numero por el que multiplicar la matriz");
                            num = Lectura.cap();
                            matrizB = Operaciones2.escalar(tam, num, matrizA);
                            Lectura.escritura(tam, tam, matrizB);
                            break;
                        }
                        case 2: {
                            tam = 3;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            matrizA = Lectura.matriz_dim(tam, tam);
                            Lectura.imprimir("Ingrese un numero por el que multiplicar la matriz");
                            num = Lectura.cap();
                            matrizB = Operaciones2.escalar(tam, num, matrizA);
                            Lectura.escritura(tam, tam, matrizB);
                            break;
                        }
                        case 3: {
                            tam = 4;
                            int matrizA[][] = new int[tam][tam];
                            int matrizB[][] = new int[tam][tam];
                            matrizA = Lectura.matriz_dim(tam, tam);
                            Lectura.imprimir("Ingrese un numero por el que multiplicar la matriz");
                            num = Lectura.cap();
                            matrizB = Operaciones2.escalar(tam, num, matrizA);
                            Lectura.escritura(tam, tam, matrizB);
                            break;
                        }
                    }
                    break;
                }
                case 4: {
                    Lectura.imprimir("Ingrese el numero de filas");
                    fila1 = Lectura.cap();
                    Lectura.imprimir("Ingrese el numero de columnas");
                    col1 = Lectura.cap();
                    int matrizA[][] = new int[fila1][col1];
                    int matrizB[][] = new int[col1][fila1];
                    Lectura.matriz_dim(fila1, col1);
                    matrizB = Operaciones2.traspuesta(fila1, col1, matrizA);
                    Lectura.escritura(fila1, col1, matrizB);
                    break;
                }
            }
        } while (opcion != 5);
    }
}
