/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ALEJANDRO
 */
public class Metodos {

    public static void main(String[] args) {

        int opcion, tam;
        do {
            Mostrar.menu();
            opcion=Llenado.captura();
            switch (opcion) {
                case 1:{
                 tam=100; double l[]=new double[4]; l=Tabla.comparacion(tam, l); Mostrar.imprimir(l);
                /*tam=100; double m[] = new double[tam]; m = Llenado.ramdom(tam, m);  m = Orden.burbuja1(tam, m);m=Llenado.ramdom(tam, m); m=Orden.insercion(m); Mostrar.imprimir(m); break;*/
                }
                case 2: {
                    double l[]=new double [4];
                 /*tam=100; double m[] = new double[tam]; m=Llenado.ramdom(tam, m); m=Orden.insercion(m); Mostrar.imprimir(m); break;*/
                }
                
            }
        } while (opcion != 5);

        
        
       

    }

}
