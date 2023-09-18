/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ALEJANDRO
 */
public class Asignatura {
    
    
    int codigo;
    String nombre;
    int semestre;
    int num_creditos;
    String horario;

    public Asignatura(int codigo, String nombre, int semestre, int num_creditos, String horario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.semestre = semestre;
        this.num_creditos = num_creditos;
        this.horario = horario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getNum_creditos() {
        return num_creditos;
    }

    public void setNum_creditos(int num_creditos) {
        this.num_creditos = num_creditos;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
    @Override
    public String toString(){
        
        return String.format("%-7d  %-35s%5d%7s", codigo, nombre, num_creditos, horario);
    }
    
}
