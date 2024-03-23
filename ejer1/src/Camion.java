package vehiculos;
public class Camion extends  Vehiculo{
    private float carga;

    public Camion() {
    }

    public Camion(float carga) {
        this.carga = carga;
    }

    public Camion(String propietario, int puertas, int ruedas, float carga) {
        super(propietario, puertas, ruedas);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
    }

    @Override
    public void caracteristicas() {
        System.out.println("El camion es de: "+this.getPropietario());
        System.out.println("Puertas: "+this.getPuertas());
        System.out.println("Ruedas: "+this.getRuedas());
        if (carga>=1000){
            System.out.println("El camion esta sobrecargado");
        }else{
            System.out.println("Puede continuar");
        }
    }
}
