import java.util.List;
import java.util.ArrayList;
public class EquipoNacional {
    private String color;
    private String country;
    private List<Atleta> atletas=new ArrayList<>();
    private int num=0;

    public EquipoNacional(String color, String country) {
        this.color = color;
        this.country=country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Atleta> getA() {
        return atletas;
    }

    public void addA(Atleta a) {
        atletas.add(a);
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
