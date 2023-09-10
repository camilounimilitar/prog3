/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ALEJANDRO
 */
public class Metodos {

    public static void main(String[] args) {

        int opcion, tam = 100;
        double m[] = new double[tam];

        do {
            switch (opcion) {
                case 1:{
                m = Llenado.ramdom(tam, m);  m = Orden.burbuja1(tam, m);   Mostrar.imprimir(m);
                }
            }
        } while (opcion != 5);

        
        
       

    }

}
