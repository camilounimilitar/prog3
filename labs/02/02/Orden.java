/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Orden {

    public static double[] burbuja1(int a, double u[]) {
        double aux1, inicio, fin, total;
        inicio = System.nanoTime();
        for (int i = 0; i < a - 1; i++) {
            for (int j = 0; j < a - 1; j++) {
                if (u[j] > u[j + 1]) {
                    aux1 = u[j];
                    u[j] = u[j + 1];
                    u[j + 1] = aux1;

                }
            }
        }
        fin = System.nanoTime();
        total = fin - inicio;
        Mostrar.imprimir_double(total);
        return u;
    }
    
    

}
