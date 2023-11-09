
import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
//import javax.swing.Timer;
import java.util.TimerTask;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Logic extends javax.swing.JLabel{
    
   private Timer temp1;
   private Timer t1;
   private TimerTask a1;
   private int n1=50;
   private int fr=1;
   private int n3;
   boolean r=false;
   

    public Logic(Dimension d) {
        this.setSize(d);
        
    }

    
    public void setfig(){
        int v1 = ((int)(Math.random()*5)+1);
      
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fig" + v1 + ".png"))); 
        
        setimagen(v1);
        
    }
    public void setvelocidad(int v){
        this.n1= v;        
    }
    
    
    
    public void startAnimation() {    
           r=true;
           temp1=new Timer();
           a1 = new TimerTask() {               
               public void run() {
   
                   fr++;                   
                   if (fr<=5){
                 
                       
                        setfig();
                   }
                   else{fr=1;}
               }
           };
       
           System.out.println("inicio");                                             
           temp1.schedule(a1,0,n1); 
    }
 
     public void stopAnimation() {        
        temp1.cancel();
        a1.cancel();
        r=false;
        System.out.println("fin");                                             
    }
    
    
    public void setimagen(int temp2){
        this.n3=temp2;
    }
    
    public int getimagen(){
        return n3;
    }
    
    
    
}
