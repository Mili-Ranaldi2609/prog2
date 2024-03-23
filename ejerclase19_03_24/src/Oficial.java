public class Oficial extends Operario{
    private String sector;
    private double sueldo=0;

    public Oficial(String nombre, int antiguedad, int dni,String sector,double sueldo) {
        super(nombre, antiguedad, dni);
        this.sector = sector;
        this.sueldo=sueldo;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void sueldoEmpl(){
        if(sueldo<20000){
            System.out.println("Usted recibira un aumento.");
        }
    }
    @Override
    public String toString(){
        String s="Usted "+getNombre()+", lleva trabajando "+getAntiguedad()+" años en el sector de: "+sector;
        return s;
    }
}
