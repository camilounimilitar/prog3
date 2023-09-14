/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Tabla {
    static Orden hj=new Orden();
    static double tiempo[]=new double[4];
    static double inicio,fin,total;
    
    public static double[] comparacion(int a, double vector[]){
        double lj[]=new double[a];
        vector=Llenado.ramdom(a, lj); tiempo[0]=Orden.burbuja1(a, vector);
        vector=Llenado.ramdom(a, lj); tiempo[1]=Orden.insercion(vector);
        vector=Llenado.ramdom(a, lj); tiempo[2]=Orden.seleccion(vector);
        vector=Llenado.ramdom(a, lj); vector=Orden.mergesort(vector); tiempo[3]=hj.tot;
        return tiempo;
    }
    
    
    
    
    
    
}
