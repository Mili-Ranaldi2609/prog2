import java.util.ArrayList;
import java.util.List;
public class Instalacion {
    private String category;
    private String guy;
    private String location;
    private String name;
    private Sede s;
    private List<Prueba> pruebas=new ArrayList<>();

    public Instalacion(String category, String guy, String location, String name) {
        this.category = category;
        this.guy=guy;
        this.location=location;
        this.name=name;
    }

    public Sede getS() {
        return s;
    }

    public void setS(Sede s) {
        this.s = s;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGuy() {
        return guy;
    }

    public void setGuy(String guy) {
        this.guy = guy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }
    public void addP(Prueba p){
        pruebas.add(p);
    }
}
