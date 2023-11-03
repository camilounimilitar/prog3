
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ALEJANDRO
 */
public class Carrera extends Thread {

    private JLabel etiqueta;
    private Juego auto;

    public Carrera(JLabel etiqueta, Juego auto) {
        this.etiqueta = etiqueta;
        this.auto = auto;
    }

    @Override
    public void run() {

        int[] autos = new int[4];

        while (true) {
            try {

                sleep((int) (Math.random() * 1000));
                autos[0] = auto.getPrimerauto().getLocation().x;
                autos[1] = auto.getSegundoauto().getLocation().x;
                autos[2] = auto.gettercerauto().getLocation().x;
                autos[3] = auto.getcuartoauto().getLocation().x;

                if ((autos[0] < auto.getmeta().getLocation().x - 150) && (autos[1] < auto.getmeta().getLocation().x - 150)) {
                    etiqueta.setLocation(etiqueta.getLocation().x + 8, etiqueta.getLocation().y);
                    etiqueta.repaint();
                } else {

                }

            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

}
