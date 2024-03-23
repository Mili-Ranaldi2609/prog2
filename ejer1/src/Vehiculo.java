package vehiculos;
public abstract class Vehiculo {
    private String propietario;
    private int puertas;
    private int ruedas;
    public Vehiculo() {
    }

    public Vehiculo(String propietario, int puertas, int ruedas){
        this.propietario=propietario;
        this.puertas=puertas;
        this.ruedas=ruedas;
        }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public abstract void caracteristicas();
}
