import java.util.List;
import java.util.ArrayList;
public class Sede {
    private int phase;
    private String date;
    private String hour;
    private Instalacion instalacion;
    private Prueba prueba;

    public Sede(int phase,String date,String hour,Instalacion instalacion,Prueba prueba) {
        this.instalacion = instalacion;
        this.prueba = prueba;
        this.instalacion=instalacion;
        this.prueba=prueba;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }

    public Prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }

}
