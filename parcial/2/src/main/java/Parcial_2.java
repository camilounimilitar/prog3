
import java.util.Scanner;
import java.util.Timer;

public class Parcial_2 {

    public static void main(String[] args) {
        Scanner on = new Scanner(System.in);
        Timer timer = new Timer();
        // System.out.println("elija una opcion \n1.Programar un temporizador\n2.Sumar un aleatorio al tiempo actual\n3.Salir");
        //int opc = on.nextInt();
        int opc;
        do {
            System.out.println("elija una opcion \n1.Programar un temporizador\n2.Programar una llamada\n3.Salir");
            opc = on.nextInt();
            on.nextLine();
            switch (opc) {
                case 1: {
                    while (true) {
                        System.out.print("Que tiempo en segundos desea o oprima 'e' para salir: ");

                        int timeEspera;
                        if (on.hasNextInt()) {
                            timeEspera = on.nextInt();
                        } else {
                            String entrada = on.next();
                            if (entrada.equalsIgnoreCase("e")) {
                                break;
                            } else {
                                System.out.println("Entrada no válida. Por favor, ingrese un número o 'e' para salir.");
                                continue;
                            }
                        }

                        System.out.print("Ingrese el mensaje para este temporizador: ");
                        String mns = on.next();
                        int vacio=0;
                        temporizador instancia = new temporizador(mns,vacio);
                        timer.schedule(instancia, timeEspera * 1000);

                        System.out.println();
                        System.out.println("Temporizador programado para " + timeEspera + " segundos con el mensaje: " + mns);

                        System.out.print("¿Desea programar otro temporizador? (s/n): ");
                        String respuesta = on.next();

                        if (respuesta.equalsIgnoreCase("n")) {
                            break;
                        }
                    }

                    

                }
                case 2:{
                    System.out.println("ingrese el nombre de la persona a llamar");
                    String nom=on.nextLine();
                    //on.nextLine();
                    System.out.println("¿En cuantos segundos debera ser llamdo?");
                    int n2=on.nextInt();
                    
                    Llamada llam=new Llamada(nom);
                    timer.schedule(llam, n2*1000);
                    
                    
                }
                
            }
        } while (opc < 3);
        timer.cancel();
        on.close();
    }
    
 

}
