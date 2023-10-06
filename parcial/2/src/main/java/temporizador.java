import java.util.TimerTask;

public class temporizador extends TimerTask {
    private String mensaje;

    public temporizador(String mensaje, int m) {
        this.mensaje = mensaje;
    }

    public void run() {
        System.out.println(); 
        System.out.println("Temporizador ha expirado: " + mensaje);
    }
    
    
    
}
