/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Mostrar {
    
    public static  void menu(){
        System.out.println("Elija una opcion: \n1.100 Datos \n2.500 datos \n3.1000 \n4.5000 \n5.10000");
    }
    public static void imprimir(double o[]){
        for(int i=0; i<o.length;i++){
            System.out.println(o[i] + "\t");
        }
    }
    
    public static void imprimir_double(double r){
        
        System.out.println("El Tiempo total fue: " + r);
        
    }
    public static void enunciado(){
        
        
    }
    
}
