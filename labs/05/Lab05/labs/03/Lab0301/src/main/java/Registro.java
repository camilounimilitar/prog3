
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Registro {
    Estudiante estudiante;
    Asignatura asign;
    LinkedList<String> listAsignatura;
    
    Registro(Estudiante estudiante){
    this.estudiante=estudiante;
    listAsignatura= new LinkedList<>();
    }
    

    
}
