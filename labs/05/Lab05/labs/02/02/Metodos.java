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
                 tam=100; double l[]=new double[4]; l=Tabla.comparacion(tam, l); Mostrar.enunciado(tam); Mostrar.imprimir(l);break;
                /*tam=100; double m[] = new double[tam]; m = Llenado.ramdom(tam, m);  m = Orden.burbuja1(tam, m);m=Llenado.ramdom(tam, m); m=Orden.insercion(m); Mostrar.imprimir(m); break;*/
                }
                case 2: {
                    tam=500;double l[]=new double [4]; l= Tabla.comparacion(tam, l); Mostrar.enunciado(tam);Mostrar.imprimir(l);break;
                 /*tam=100; double m[] = new double[tam]; m=Llenado.ramdom(tam, m); m=Orden.insercion(m); Mostrar.imprimir(m); break;*/
                }
                case 3:{
                    tam=1000; double l[]=new double[4];l=Tabla.comparacion(tam, l);Mostrar.enunciado(tam);Mostrar.imprimir(l);break;
                }
                case 4:{
                    tam=5000; double l[]=new double[4];l=Tabla.comparacion(tam, l);Mostrar.enunciado(tam);Mostrar.imprimir(l);break;
                }
                case 5:{
                    tam=10000;double l[]=new double[4];l=Tabla.comparacion(tam, l);Mostrar.enunciado(tam);Mostrar.imprimir(l);break;
                }
                
            }
        } while (opcion != 6);

    }

}