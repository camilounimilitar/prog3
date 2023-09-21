
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

    static LinkedList<Asignatura> materias = new LinkedList<>();
    static Queue<Registro> regist = new LinkedList<>();
  

    public static void main(String[] args) {

        registro_estudiante();
        lec_archivo();
        Salida.exit("Ingrese Las Materias A Inscribir");
        registro_asignaturas();
        reporte_registo_final();

    }

    public static void registro_estudiante() {
        String codigo = Entrada.readText("Ingreese el Cogigo Del Estudiante");
        String nombre = Entrada.readText("Ingrese El Nombre Del estudiante");
        String correo = Entrada.readText("Ingrese El Correo Del Estudiante");
        int semestre = Entrada.readInt("Ingrese El Semestre");
        Estudiante estud = new Estudiante(codigo, nombre, correo, semestre);
        regist.add(new Registro(estud));
    }

    public static void registro_asignaturas() {
        int credit = 0;
        String pregunta;
        while (credit < 5) {
            int codigo = Entrada.readInt("Ingrese el Codigo de la asignatura ");
            String nom_asignatura = Entrada.readText("Ingrese Nombre Asignaruta");Entrada.readText("");
            int semestre = Entrada.readInt("Ingrese el Semestre al que pertenece");
            int num_credi = Entrada.readInt("Ingrese el numero de creditos");
            String hora = Entrada.readText("Ingrese el horarario ");Entrada.readText("");
            materias.add(new Asignatura(codigo, nom_asignatura, semestre, num_credi, hora));
            credit += num_credi;
        }
        if (credit >= 5) {
            pregunta = Entrada.readText("¿Continuar?");
            if (pregunta.equalsIgnoreCase("si")) {
                while (credit < 16) {
                    int codigo = Entrada.readInt("Ingrese el Codigo de la asignatura ");
                    String nom_asignatura = Entrada.readText("Ingrese Nombre Asignaruta");Entrada.readText("");
                    int semestre = Entrada.readInt("Ingrese el Semestre al que pertenece");
                    int num_credi = Entrada.readInt("Ingrese el numero de creditos");
                    String hora = Entrada.readText("Ingrese el horarario ");Entrada.readText("");
                    credit += num_credi;
                    materias.add(new Asignatura(codigo, nom_asignatura, semestre, num_credi, hora));
                }
            }  
            else{
              
            }

        }

    }

    public static void reporte_registo_final() {
        
        

    }

    public static void lec_archivo() {
        FileReader archi;
        BufferedReader lector;
        String mensaje = "", lec;

        try {
            archi = new FileReader("C:\\Users\\ALEJANDRO\\Documents\\NetBeansProjects\\Lab0301\\data\\asignaturas.txt");
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

}
