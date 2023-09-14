/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Orden {
   public static double tot;

    public static double burbuja1(int a, double u[]) {
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
        return total;
    }

    public static double insercion(double u[]) {
        double aux, inicio, fin, total;
        int posicion;
        inicio = System.nanoTime();
        for (int i = 0; i < u.length; i++) {
            posicion = i;
            aux = u[i];

            while ((posicion > 0) && (u[posicion - 1] > aux)) {
                u[posicion] = u[posicion - 1];
                posicion--;
            }
            u[posicion] = aux;
        }
        fin = System.nanoTime();
        total = fin - inicio;
        return total;

    }

    public static double seleccion(double a[]) {
        int min;
        double aux, inicio, fin, total;
        inicio = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            min = i;
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            aux = a[i];
            a[i] = a[min];
            a[min] = aux;
        }
        fin = System.nanoTime();
        total = fin - inicio;
        return total;

    }

    public static double[] mergesort(double a[]) {
        double fin,inicio,total;
        inicio=System.nanoTime();
        if (a.length <= 1) {
            return a;
        } else {
            double izq[];
            double der[];

            der = new double[a.length / 2];

            if (a.length % 2 == 0) {
                izq = new double[a.length / 2];
            } else {
                izq = new double[(a.length / 2) + 1];
            }

            int i;
            for (i = 0; i < izq.length; i++) {
                izq[i] = a[i];
            }

            int k = 0;
            for (int j = i; j < a.length; ++j) {
                der[k] = a[j];
                ++k;
            }
            //double nuevo[];
            double nuevo[] = merge(mergesort(izq), mergesort(der));
           
           fin=System.nanoTime();
           tot=fin-inicio;
           
           Orden.receptor(tot);
           
            return nuevo;
        }

    }

    public static double[] merge(double a[], double b[]) {
    int i=0;
    int j=0;    
        
    double c[]=new double [a.length+b.length];
    
    for(int k=0; k< c.length ; k++){
        if(a[i]<b[j]){
            c[k]=a[i];
            ++i;
            
        }else{
            c[k]=b[j];
            ++j;             
        }
        
        if(i==a.length){
            ++k;
            for(j=j;j<b.length;j++){
              c[k]=b[j];
              ++k;
            }
        }
        else if(j==b.length){
            ++k;
            
            for(i=i;i<a.length;i++){
              c[k]=a[i];
              ++k;
            }
        }
    }
    
        return c;
    }
    
    public static double receptor(double rec){
        
       double v=rec;
       return v; 
    }

}
