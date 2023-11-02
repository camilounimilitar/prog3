
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Carrera  extends Thread{
    private JLabel etiqueta;
    private Juego auto;

    public Carrera(JLabel etiqueta, Juego auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }
    
     @Override
    public void run(){
    
        int[] autos=new int[4];
                
        while(true){
            try{
                autos[0]=
                sleep((int)(Math.random()*1000));
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
}
    
    
    
    
}
