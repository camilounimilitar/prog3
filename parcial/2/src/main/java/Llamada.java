
import java.util.TimerTask;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Llamada extends TimerTask {
    
     private String nombre;

    public Llamada(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("Llamando a " + nombre);
       
    }
    
}
