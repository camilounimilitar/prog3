
import java.io.BufferedReader;
import java.io.FileReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ALEJANDRO
 */
public class Leer_Archivo {
   static String mensaje="";
    public static void lec_archivo() {
        FileReader archi;
        BufferedReader lector;
        String lec;

        try {
            archi = new FileReader("C:\\Users\\ALEJANDRO\\Documents\\NetBeansProjects\\Lab05\\Saber_11__2019-2_20231016.csv");
            if (archi.ready()) {
                lector = new BufferedReader(archi);

                while ((lec = lector.readLine()) != null) {
                    mensaje = mensaje + lec + "\n";
                }
            } else {
                System.out.println("El archivo no esta listo para ser leido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(mensaje);
    }
    
    public static void impresion(){
        System.out.println(mensaje);
    
}
    
    
}
