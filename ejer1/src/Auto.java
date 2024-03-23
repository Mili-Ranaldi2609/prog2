package vehiculos;
public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto() {
    }

    public Auto(String propietario, int puertas, int ruedas, boolean descapotable) {
        super(propietario, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    @Override
    public void caracteristicas() {
        System.out.println("El auto es de: "+this.getPropietario());
        System.out.println("Puertas: "+this.getPuertas());
        System.out.println("Ruedas: "+this.getRuedas());
        if (isDescapotable()){
            System.out.println("Es descapotable.");
        }

    }
}
