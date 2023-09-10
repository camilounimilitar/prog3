
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ALEJANDRO
 */
public class Llenado {

    static Scanner in = new Scanner(System.in);

    public static double[] ramdom(int a, double arreglo[]) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 100;
        }
        return arreglo;
    }

    public static int captura() {
        return in.nextInt();
    }

}
