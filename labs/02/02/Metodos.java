/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ALEJANDRO
 */
public class Metodos {

    public static void main(String[] args) {
        Metodos h=new Metodos();
         
        
        int tam=100;
        double m[] = new double[tam];
        
        m=Llenado.ramdom(tam, m);
        m=Orden.burbuja1(tam, m);
        Mostrar.imprimir(m);

    }
    
    
    
}
