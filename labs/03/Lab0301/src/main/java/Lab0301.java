
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author ALEJANDRO
 */
public class Lab0301 {
    

    static Queue<Registro> regis = new LinkedList<>();

    public static void main(String[] args) {
        lec_archivo();
        registro_estudiante();
        registro_asignaturas();
        reporte_registo_final();

    }

    public static void registro_estudiante() {
        String codigo = Entrada.readText("Cogigo Estudiante");
        String nombre = Entrada.readText("Nombre estudiante");
        String correo = Entrada.readText("Correo Estudiante");
        int semestre = Entrada.readInt("Semestre ");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        regis.add(new Registro(estud));

    }

    public static void registro_asignaturas() {
        int codigo = Entrada.readInt("Codigo de la asignatura ");
        String nom_asignatura = Entrada.readText("Nombre Asignaruta");

    }

    public static void reporte_registo_final() {

    }

    public static void lec_archivo() {
        FileReader archi;
        BufferedReader lector;
        String mensaje="",lec;

        try {
            archi = new FileReader("C:\\Users\\ALEJANDRO\\Documents\\NetBeansProjects\\Lab0301\\data\\asignaturas.txt");
            if (archi.ready()) {
                lector=new BufferedReader(archi);
                
                while((lec=lector.readLine())!=null){
                    mensaje=mensaje + lec+"\n";
                } 
            }else{
                System.out.println("El archivo no esta listo para ser leido");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        System.out.println(mensaje);
    }
}
