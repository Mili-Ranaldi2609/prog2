import java.util.List;
import java.util.ArrayList;
public class Prueba {
    private int code;
    private String qualification;
    private List<Atleta>atletas=new ArrayList<>();

    public Sede sede;

    public Prueba(int code,String qualification) {
        this.code = code;
        this.qualification=qualification;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public List<Atleta> getAtletas() {
        return atletas;
    }

    public void addAtleta(Atleta a){
        atletas.add(a);
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
