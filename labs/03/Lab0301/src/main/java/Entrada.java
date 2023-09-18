
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Entrada {
    
    private static Scanner imput= new Scanner (System.in);
    
    public static int readInt(String mss){
        
        System.out.println(mss);
        return imput.nextInt();
     
    }
    
    
     public static String readText(String mss){
        
        System.out.println(mss);
        return imput.nextLine();
     
    }
     
     
    
}
