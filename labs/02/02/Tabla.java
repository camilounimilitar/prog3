/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Tabla {
    
    static double tiempo[]=new double[5];
    static double temp;
    
    
    public static double[] comparacion(int a, double vector[]){
        vector=Llenado.ramdom(a, vector); tiempo[0]=Orden.burbuja1(a, vector);
        vector=Llenado.ramdom(a, vector); tiempo[1]=Orden.insercion(vector);
        vector=Llenado.ramdom(a, vector); tiempo[2]=Orden.seleccion(vector);
        
        
        return tiempo;
    }
    
    
    
    
}
