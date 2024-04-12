package composicion;
import java.util.List;
import java.util.ArrayList;
public class Casa {
    private List<Puerta>puertas=new ArrayList<>();
    private int contPuertas=0;

    public Casa() {
    }

    public Casa(List<Puerta> puertas, int contPuertas) {
        this.puertas = puertas;
        this.contPuertas=contPuertas;
        for (int i = 0; i < contPuertas; i++) {
            puertas.add(new Puerta("Material " + (i+1)));
        }
    }

    public int getContPuertas() {
        return contPuertas;
    }

    public void setContPuertas(int contPuertas) {
        this.contPuertas = contPuertas;
    }

    public List<Puerta> getPuertas() {
        return puertas;
    }
    public void agregarPuerta(String material) {
        puertas.add(new Puerta(material));
    }
    public void setPuertas(List<Puerta> puertas) {
        this.puertas = puertas;
    }
}
